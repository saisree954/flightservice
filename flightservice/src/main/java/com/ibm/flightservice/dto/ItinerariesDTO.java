package com.ibm.flightservice.dto;

import java.util.List;

public class ItinerariesDTO {
	
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<SegmentsDTO> getSegments() {
		return segments;
	}

	public void setSegments(List<SegmentsDTO> segments) {
		this.segments = segments;
	}

	private String duration;
	
	private List<SegmentsDTO> segments;

}
