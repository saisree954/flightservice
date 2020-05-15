package com.ibm.flightservice.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.resources.FlightOfferSearch;
import com.ibm.flightservice.config.SecurityConfiguration;
import com.ibm.flightservice.dto.FlightRequestDTO;
import com.ibm.flightservice.dto.FlightSearchResponseDTO;
import com.ibm.flightservice.dto.ResponseMapper;

@Service
public class FlightSearchService {
	
	private final static Logger logger = Logger.getLogger(FlightSearchService.class.getName());
	
	@Autowired
	private SecurityConfiguration configuaration;
	
	public FlightSearchResponseDTO flightSearch(FlightRequestDTO flightRequestDTO) {	
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");	
		
		Date   defatureDate =null;
		Date   returnDate=null;
		
	
		
		
		try {
		defatureDate=	format.parse(flightRequestDTO.getDepartureDate());
		
		returnDate= format.parse(flightRequestDTO.getReturnDate());
		
		
		
		}catch(Exception exp) {
			
		}
		
		 Amadeus amadeus = Amadeus
			        .builder(configuaration.getClientId(),configuaration.getClientSecret()).setLogger(logger).setLogLevel("debug")
			        .build();
		 
		FlightOfferSearch[] flightOffersSearches = null;
				try { 
					if(returnDate!=null){
				 flightOffersSearches=	 amadeus.shopping.flightOffersSearch.get(
			        Params.with("originLocationCode", flightRequestDTO.getOriginLocationCode())
			                .and("destinationLocationCode", flightRequestDTO.getDestinationLocationCode())
			                .and("departureDate",format.format(defatureDate) )
			                .and("returnDate", format.format(returnDate))
			                .and("adults", flightRequestDTO.getAdults())
			                .and("max", flightRequestDTO.getMax()));
					} else	{ flightOffersSearches=	 amadeus.shopping.flightOffersSearch.get(
							        Params.with("originLocationCode", flightRequestDTO.getOriginLocationCode())
							                .and("destinationLocationCode", flightRequestDTO.getDestinationLocationCode())
							                .and("departureDate",format.format(defatureDate) )
							                .and("adults", flightRequestDTO.getAdults())
							                .and("max", flightRequestDTO.getMax()));
					}
				}catch(Exception exp) {
					
					
				}
		
			/*	FlightPrice flightPricing = null;
				try {
					flightPricing= amadeus.shopping.flightOffersSearch.pricing.post(
			            flightOffersSearches,
			            Params.with("include", "detailed-fare-rules")
			              .and("forceClass", "false")
			          );  
				}catch(Exception exp1) {
					
				} */

				 
				
		List<FlightOfferSearch> flighSearches= Arrays.asList(flightOffersSearches);
		
		ResponseMapper responseMapper=new ResponseMapper();
		FlightSearchResponseDTO flightResponse= responseMapper.converter(flighSearches);
		return flightResponse;
	}
		

}
