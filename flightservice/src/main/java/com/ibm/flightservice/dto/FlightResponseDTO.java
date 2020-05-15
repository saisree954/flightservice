package com.ibm.flightservice.dto;

import java.util.List;

import com.amadeus.resources.FlightOfferSearch;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResponseDTO {
	
	@JsonProperty
	private List<FlightOfferSearch> flightOfferSearch;

	public List<FlightOfferSearch> getFlightOfferSearch() {
		return flightOfferSearch;
	}

	public void setFlightOfferSearch(List<FlightOfferSearch> flightOfferSearch) {
		this.flightOfferSearch = flightOfferSearch;
	}
}
