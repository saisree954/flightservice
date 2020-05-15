package com.ibm.flightservice.dto;


public class SegmentsDTO {
	
	private Depature depature;
	
	public static class Depature{
		private String iataCode;
        public String getIataCode() {
			return iataCode;
		}
		public void setIataCode(String iataCode) {
			this.iataCode = iataCode;
		}
		public String getTerminal() {
			return terminal;
		}
		public void setTerminal(String terminal) {
			this.terminal = terminal;
		}
		public String getAt() {
			return at;
		}
		public void setAt(String at) {
			this.at = at;
		}
		private String terminal;
        private String at;
        
       
    }
	
	private Arrival arrival;
	
	public static class Arrival{
		
		public String getIataCode() {
			return iataCode;
		}
		public void setIataCode(String iataCode) {
			this.iataCode = iataCode;
		}
		public String getAt() {
			return at;
		}
		public void setAt(String at) {
			this.at = at;
		}
		private String iataCode;
        private String at;
	}
	
	private String carrierCode;
    public Depature getDepature() {
		return depature;
	}
	public void setDepature(Depature depature) {
		this.depature = depature;
	}
	public Arrival getArrival() {
		return arrival;
	}
	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Aircraft getAircraft() {
		return aircraft;
	}
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getNumberOfStops() {
		return numberOfStops;
	}
	public void setNumberOfStops(Integer numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
	public Boolean getBlacklistedInEU() {
		return blacklistedInEU;
	}
	public void setBlacklistedInEU(Boolean blacklistedInEU) {
		this.blacklistedInEU = blacklistedInEU;
	}
	private String number;
    
    private Aircraft aircraft;
    
    public static class Aircraft{
    	private String code;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
    }
    
    private String duration;
    private String id;
    private Integer numberOfStops; 
    private Boolean blacklistedInEU;
    

}
