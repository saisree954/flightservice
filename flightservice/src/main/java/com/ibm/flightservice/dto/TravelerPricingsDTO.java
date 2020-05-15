package com.ibm.flightservice.dto;

import java.util.List;

public class TravelerPricingsDTO {
	
	private String travelerId;
     private String fareOption;
     private String travelerType;
     
     private Price price;
     
     public String getTravelerId() {
		return travelerId;
	}

	public void setTravelerId(String travelerId) {
		this.travelerId = travelerId;
	}

	public String getFareOption() {
		return fareOption;
	}

	public void setFareOption(String fareOption) {
		this.fareOption = fareOption;
	}

	public String getTravelerType() {
		return travelerType;
	}

	public void setTravelerType(String travelerType) {
		this.travelerType = travelerType;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public List<FareDetailsBySegment> getFareDetailsBySegment() {
		return fareDetailsBySegment;
	}

	public void setFareDetailsBySegment(List<FareDetailsBySegment> fareDetailsBySegment) {
		this.fareDetailsBySegment = fareDetailsBySegment;
	}

	public static class Price{
    	 private String currency;
			private Double total;
    	    private Double base;
    	    public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public Double getTotal() {
			return total;
		}
		public void setTotal(Double total) {
			this.total = total;
		}
		public Double getBase() {
			return base;
		}
		public void setBase(Double base) {
			this.base = base;
		}
		
     }

      private List<FareDetailsBySegment> fareDetailsBySegment;
      
      public static class FareDetailsBySegment{
    	  
    	private String segmentId;
        private String cabin;
        private String fareBasis;
        private String brandedFare;
        private String aclass;
        private IncludedCheckedBags includedCheckedBags;
        
        public static class IncludedCheckedBags{
          private Integer  quantity;

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
        }

		public String getSegmentId() {
			return segmentId;
		}

		public void setSegmentId(String segmentId) {
			this.segmentId = segmentId;
		}

		public String getCabin() {
			return cabin;
		}

		public void setCabin(String cabin) {
			this.cabin = cabin;
		}

		public String getFareBasis() {
			return fareBasis;
		}

		public void setFareBasis(String fareBasis) {
			this.fareBasis = fareBasis;
		}

		public String getBrandedFare() {
			return brandedFare;
		}

		public void setBrandedFare(String brandedFare) {
			this.brandedFare = brandedFare;
		}

		public String getAclass() {
			return aclass;
		}

		public void setAclass(String aclass) {
			this.aclass = aclass;
		}

		public IncludedCheckedBags getIncludedCheckedBags() {
			return includedCheckedBags;
		}

		public void setIncludedCheckedBags(IncludedCheckedBags includedCheckedBags) {
			this.includedCheckedBags = includedCheckedBags;
		}
         
      }
}
