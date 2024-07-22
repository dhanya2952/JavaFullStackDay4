package com.graymatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DemoOnDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date= new Date("07/18/24");
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
		String myDate="18-07-2024";
		date=sdf.parse(myDate);
		System.out.println(date);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		localDate=LocalDate.of(2024, 07, 18);
		System.out.println(localDate);
		
		//to change the date format repr
		String pattern="2024-07-18";
		localDate=LocalDate.parse(pattern);
		System.out.println(localDate);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date2=localDate.format(formatter);
		//localDate = LocalDate.parse(myDate,formatter);
    	System.out.println(date2);
		
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		System.out.println(localDate.getDayOfWeek());		
		
		String myJoin="2020-07-07";
		LocalDate doj=LocalDate.parse(myJoin);
		
		String myLeave="2024-06-30";
		LocalDate dol=LocalDate.parse(myLeave);
		
		Period p=Period.between(doj, dol);
		System.out.println(p);
		System.out.println("toal period of work= "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
		
		
		

	}

}
