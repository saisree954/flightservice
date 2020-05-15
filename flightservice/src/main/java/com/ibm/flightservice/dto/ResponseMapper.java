package com.ibm.flightservice.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightOfferSearch.Aircraft;
import com.amadeus.resources.FlightOfferSearch.AirportInfo;
import com.amadeus.resources.FlightOfferSearch.FareDetailsBySegment;
import com.amadeus.resources.FlightOfferSearch.Fee;
import com.amadeus.resources.FlightOfferSearch.Itinerary;
import com.amadeus.resources.FlightOfferSearch.PricingOptions;
import com.amadeus.resources.FlightOfferSearch.SearchPrice;
import com.amadeus.resources.FlightOfferSearch.SearchSegment;
import com.amadeus.resources.FlightOfferSearch.TravelerPricing;

public class ResponseMapper {

	public FlightSearchResponseDTO converter(List<FlightOfferSearch> flightOffers) {

		FlightSearchResponseDTO dto = new FlightSearchResponseDTO();

		List<DataDTO> listDataDTO = new ArrayList<DataDTO>();

		for (FlightOfferSearch flightOffer : flightOffers) {
			DataDTO dataDTO = new DataDTO();
			dataDTO.setId(flightOffer.getId());
			dataDTO.setType(flightOffer.getType());
			dataDTO.setSource(flightOffer.getSource());
			dataDTO.setInstantTicketingRequired(flightOffer.isInstantTicketingRequired());
			dataDTO.setNonHomogeneous(flightOffer.isNonHomogeneous());
			dataDTO.setOneWay(flightOffer.isOneWay());
			dataDTO.setLastTicketingDate(flightOffer.getLastTicketingDate());

			dataDTO.setNumberOfBookableSeats(flightOffer.getNumberOfBookableSeats());

			PricingOptions pricingOption = flightOffer.getPricingOptions();

			DataDTO.PricingOptions pricingOptionInner = new DataDTO.PricingOptions();

			pricingOptionInner.setIncludedCheckedBagsOnly(pricingOption.isIncludedCheckedBagsOnly());

			Itinerary itins[] = flightOffer.getItineraries();

			SearchPrice searchprice = flightOffer.getPrice();

			String airlineCodes[] = flightOffer.getValidatingAirlineCodes();

			dataDTO.setValidatingAirlineCodes(Arrays.asList(airlineCodes));

		

			List<ItinerariesDTO> listItinerariesDTO = new ArrayList<ItinerariesDTO>();

			for (Itinerary itin : itins) {

				List<SegmentsDTO> listSegment = new ArrayList<SegmentsDTO>();
				ItinerariesDTO itinerariesDTO = new ItinerariesDTO();

				itinerariesDTO.setDuration(itin.getDuration());

				SearchSegment segments[] = itin.getSegments();

				for (SearchSegment segment : segments) {

					SegmentsDTO segment1 = new SegmentsDTO();
					SegmentsDTO.Aircraft aircraft = new SegmentsDTO.Aircraft();
					SegmentsDTO.Depature depature = new SegmentsDTO.Depature();
					SegmentsDTO.Arrival arrival = new SegmentsDTO.Arrival();
					AirportInfo info = segment.getDeparture();

					if (info != null) {
						depature.setIataCode(info.getIataCode());
						depature.setTerminal(info.getTerminal());
						depature.setAt(info.getAt());

						segment1.setDepature(depature);

					}
					AirportInfo arrival1 = segment.getArrival();
					if (arrival1 != null) {
						arrival.setAt(arrival1.getAt());
						arrival.setIataCode(arrival1.getIataCode());
						segment1.setArrival(arrival);
					}

					segment1.setCarrierCode(segment.getCarrierCode());
					segment1.setNumber(segment.getNumber());

					Aircraft aircraft1 = segment.getAircraft();

					if (aircraft1 != null) {
						aircraft.setCode(aircraft1.getCode());
						segment1.setAircraft(aircraft);
					}
					segment1.setCarrierCode(segment.getCarrierCode());

					segment1.setDuration(segment.getDuration());

					segment1.setId(segment.getId());

					segment1.setNumberOfStops(segment.getNumberOfStops());
					segment1.setBlacklistedInEU(segment.isBlacklistedInEU());

					listSegment.add(segment1);

				}

				itinerariesDTO.setSegments(listSegment);
				listItinerariesDTO.add(itinerariesDTO);

			}

			dataDTO.setItineraries(listItinerariesDTO);

			PriceDTO priceDTO = new PriceDTO();

			priceDTO.setCurrency(searchprice.getCurrency());

			priceDTO.setBase(searchprice.getBase());

			priceDTO.setTotal(searchprice.getTotal());

			priceDTO.setGrandTotal(searchprice.getGrandTotal());

			Fee fees[] = searchprice.getFees();

			List<PriceDTO.Fees> listfeesDTO = new ArrayList<PriceDTO.Fees>();

			for (Fee fee : fees) {
				PriceDTO.Fees feesDTO = new PriceDTO.Fees();
				feesDTO.setAmount(fee.getAmount());
				feesDTO.setType(fee.getType());

				listfeesDTO.add(feesDTO);

			}
			priceDTO.setFees(listfeesDTO);

			dataDTO.setPrice(priceDTO);

			TravelerPricing travelPricings[] = flightOffer.getTravelerPricings();

			for (TravelerPricing travelPricing : travelPricings) {

				List<TravelerPricingsDTO> listTravelerPricingsDTO = new ArrayList<TravelerPricingsDTO>();
				TravelerPricingsDTO travelerPricingsDTO = new TravelerPricingsDTO();
				TravelerPricingsDTO.Price priceDTO1 = new TravelerPricingsDTO.Price();
				travelerPricingsDTO.setTravelerId(travelPricing.getTravelerId());
				travelerPricingsDTO.setFareOption(travelPricing.getFareOption());
				travelerPricingsDTO.setTravelerType(travelPricing.getTravelerType());
				SearchPrice price = travelPricing.getPrice();

				priceDTO1.setBase(price.getBase());

				priceDTO1.setCurrency(price.getCurrency());

				priceDTO1.setTotal(price.getTotal());

				travelerPricingsDTO.setPrice(priceDTO1);

				FareDetailsBySegment fareDetailSegments[] = travelPricing.getFareDetailsBySegment();
				List<TravelerPricingsDTO.FareDetailsBySegment> listFareDetailsSegment = new ArrayList<TravelerPricingsDTO.FareDetailsBySegment>();
				for (FareDetailsBySegment fareDetailSegment : fareDetailSegments) {

					TravelerPricingsDTO.FareDetailsBySegment fareDetailsBySegmentDTO = new TravelerPricingsDTO.FareDetailsBySegment();

					fareDetailsBySegmentDTO.setSegmentId(fareDetailSegment.getSegmentId());
					fareDetailsBySegmentDTO.setCabin(fareDetailSegment.getCabin());
					fareDetailsBySegmentDTO.setFareBasis(fareDetailSegment.getFareBasis());

					listFareDetailsSegment.add(fareDetailsBySegmentDTO);
					travelerPricingsDTO.setFareDetailsBySegment(listFareDetailsSegment);

					TravelerPricingsDTO.FareDetailsBySegment.IncludedCheckedBags includedCheckedBagsDTO = new TravelerPricingsDTO.FareDetailsBySegment.IncludedCheckedBags();

					includedCheckedBagsDTO.setQuantity(0);

					fareDetailsBySegmentDTO.setIncludedCheckedBags(includedCheckedBagsDTO);

					travelerPricingsDTO.setFareDetailsBySegment(listFareDetailsSegment);

				}

				listTravelerPricingsDTO.add(travelerPricingsDTO);

				dataDTO.setTravelerPricings(listTravelerPricingsDTO);

			}

			listDataDTO.add(dataDTO);

		}
		dto.setData(listDataDTO);
		return dto;
	}

}
