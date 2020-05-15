package com.ibm.flightservice.dto;




public class FlightRequestDTO {
	
private String originLocationCode;

private String destinationLocationCode;

private String departureDate;

private String returnDate;

private Integer adults;

private Integer children;

private Integer infants;

private String travelClass;

private String includedAirlineCodes;

private Boolean nonstop;

private String currencyCode;

private Integer maxPrice;

private Integer max;

public String getOriginLocationCode() {
	return originLocationCode;
}

public void setOriginLocationCode(String originLocationCode) {
	this.originLocationCode = originLocationCode;
}

public String getDestinationLocationCode() {
	return destinationLocationCode;
}

public void setDestinationLocationCode(String destinationLocationCode) {
	this.destinationLocationCode = destinationLocationCode;
}



public String getDepartureDate() {
	return departureDate;
}

public void setDepartureDate(String departureDate) {
	this.departureDate = departureDate;
}

public String getReturnDate() {
	return returnDate;
}

public void setReturnDate(String returnDate) {
	this.returnDate = returnDate;
}

public Integer getAdults() {
	return adults;
}

public void setAdults(Integer adults) {
	this.adults = adults;
}

public Integer getChildren() {
	return children;
}

public void setChildren(Integer children) {
	this.children = children;
}

public Integer getInfants() {
	return infants;
}

public void setInfants(Integer infants) {
	this.infants = infants;
}

public String getTravelClass() {
	return travelClass;
}

public void setTravelClass(String travelClass) {
	this.travelClass = travelClass;
}

public String getIncludedAirlineCodes() {
	return includedAirlineCodes;
}

public void setIncludedAirlineCodes(String includedAirlineCodes) {
	this.includedAirlineCodes = includedAirlineCodes;
}

public Boolean getNonstop() {
	return nonstop;
}

public void setNonstop(Boolean nonstop) {
	this.nonstop = nonstop;
}

public String getCurrencyCode() {
	return currencyCode;
}

public void setCurrencyCode(String currencyCode) {
	this.currencyCode = currencyCode;
}

public Integer getMaxPrice() {
	return maxPrice;
}

public void setMaxPrice(Integer maxPrice) {
	this.maxPrice = maxPrice;
}

public Integer getMax() {
	return max;
}

public void setMax(Integer max) {
	this.max = max;
}




}
