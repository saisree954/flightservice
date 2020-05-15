package com.ibm.flightservice.dto;

import java.util.Date;
import java.util.List;



public class DataDTO {
	
	private String type;
	
	private String id;
	
	private String source;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean isInstantTicketingRequired() {
		return instantTicketingRequired;
	}

	public void setInstantTicketingRequired(boolean instantTicketingRequired) {
		this.instantTicketingRequired = instantTicketingRequired;
	}

	public boolean isNonHomogeneous() {
		return nonHomogeneous;
	}

	public void setNonHomogeneous(boolean nonHomogeneous) {
		this.nonHomogeneous = nonHomogeneous;
	}

	public boolean isOneWay() {
		return oneWay;
	}

	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}

	

	public Date getLastTicketingDate() {
		return lastTicketingDate;
	}

	public void setLastTicketingDate(Date lastTicketingDate) {
		this.lastTicketingDate = lastTicketingDate;
	}

	public Integer getNumberOfBookableSeats() {
		return numberOfBookableSeats;
	}

	public void setNumberOfBookableSeats(Integer numberOfBookableSeats) {
		this.numberOfBookableSeats = numberOfBookableSeats;
	}

	public List<ItinerariesDTO> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<ItinerariesDTO> itineraries) {
		this.itineraries = itineraries;
	}

	public PriceDTO getPrice() {
		return price;
	}

	public void setPrice(PriceDTO price) {
		this.price = price;
	}

	public PricingOptions getPricingOptions() {
		return pricingOptions;
	}

	public void setPricingOptions(PricingOptions pricingOptions) {
		this.pricingOptions = pricingOptions;
	}

	public List<String> getValidatingAirlineCodes() {
		return validatingAirlineCodes;
	}

	public void setValidatingAirlineCodes(List<String> validatingAirlineCodes) {
		this.validatingAirlineCodes = validatingAirlineCodes;
	}

	public List<TravelerPricingsDTO> getTravelerPricings() {
		return travelerPricings;
	}

	public void setTravelerPricings(List<TravelerPricingsDTO> travelerPricings) {
		this.travelerPricings = travelerPricings;
	}

	private boolean instantTicketingRequired;
	
    private boolean nonHomogeneous;
    private boolean oneWay;
    private Date lastTicketingDate;
    
    private Integer numberOfBookableSeats;
    
    private List<ItinerariesDTO> itineraries;
    
    private PriceDTO price;
    
    private PricingOptions pricingOptions;
    
    public static class PricingOptions{
    	
    	private List<String> fareType;
    	
    	public List<String> getFareType() {
			return fareType;
		}

		public void setFareType(List<String> fareType) {
			this.fareType = fareType;
		}

		private Boolean includedCheckedBagsOnly;

		public Boolean getIncludedCheckedBagsOnly() {
			return includedCheckedBagsOnly;
		}

		public void setIncludedCheckedBagsOnly(Boolean includedCheckedBagsOnly) {
			this.includedCheckedBagsOnly = includedCheckedBagsOnly;
		}
    }
    
    private List<String> validatingAirlineCodes;
    
    private List<TravelerPricingsDTO> travelerPricings;

	
}
