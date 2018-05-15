package com.oca.session6;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OCA_04_LocalDateTime {

	public static void main(String[] args) throws Exception {
		
		Calendar calendar = GregorianCalendar.getInstance();
		System.out.println("Month of calendar=" + calendar.get(Calendar.MONTH));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Month of localDate=" + localDateTime.getMonthValue());
		
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.MONTH, -1);
		System.out.println("Calendar after add and add" + calendar);
		
		localDateTime = localDateTime.plusDays(1).minusMonths(1).plusYears(212);
		System.out.println("localDateTime after plus and minus=" + localDateTime);
		
		Duration duration = Duration.ofDays(1);
		Duration duration2 = Duration.of(1, ChronoUnit.DAYS);
		Duration duration3 = duration.plus(duration2);
		localDateTime = localDateTime.plus((TemporalAmount)duration3);
		System.out.println("localDateTime after plus(duration)=" + localDateTime);
		
		Period period = Period.ofYears(3);
		localDateTime = localDateTime.plus(period);
		System.out.println("localDateTime after plus(period)=" + localDateTime);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(localDateTime == ldt);
		System.out.println(localDateTime.equals(ldt));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
		System.out.println("sdf.format()=" + sdf.format(new Date()));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
		System.out.println("dtf.format()=" + dtf.format(ldt));
		System.out.println("ldt.format()=" + ldt.format(dtf));
		
		System.out.println("sdf.parse()=" + sdf.parse("31-12-2018 23:59:59"));
		System.out.println("LocalDateTime.parse()=" + LocalDateTime.parse("31-12-2018 23:59:59", dtf));
	}
}
