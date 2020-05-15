package com.ibm.flightservice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJava {
	
	public static void main(String args[])throws Exception {
		
		String date1="2016-11-09";
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");		
		Date   date = format.parse (date1);

		String dateString = format.format(date );
		System.out.println("Depature date"+dateString);
	}

}
