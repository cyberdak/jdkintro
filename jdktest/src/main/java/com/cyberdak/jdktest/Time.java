package com.cyberdak.jdktest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Time {
	private static void time(){
		LocalTime time = LocalTime.now();
		System.out.println(time.toString());

		LocalDate date = LocalDate.now();
		System.out.println(date.toString());

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay_2014);
		
		LocalDateTime dt = LocalDateTime.parse("2014-01-01 11:11:11", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		//format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
	}
	
	private static void api(){
		// 和 BigInteger 的操作一样，因为不可变，所以要给函数的返回值赋值
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		LocalDateTime tenDays = dt.plusDays(10L);
		System.out.println(tenDays.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		LocalDateTime nextYear = dt.plusYears(1L);
		System.out.println(nextYear.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}
	
	
	private static void oldStyle(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
		SimpleDateFormat sdf =
		  new SimpleDateFormat("E MM/dd/yyyy HH:mm:ss.SSS");
		calendar.add(Calendar.DAY_OF_MONTH, 90);
		System.out.println(sdf.format(calendar.getTime()));
	}
	
	private static void newStyle(){
		LocalDateTime dt = LocalDateTime.of(2000, Month.JANUARY, 20, 0, 0);
		System.out.println(dt.plusDays(90L).format(DateTimeFormatter.ofPattern("YYYY-mm-dd HH:mm:ss")));
	}

	public static void main(String[] args) {
		time();
		api();
	}
}
