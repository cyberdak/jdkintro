package com.cyberdak.jdktest;

public class Autoboxing {
		private static void useLong(){
			long t = System.currentTimeMillis();
			Long sum = 0L;
			for (long i = 0; i < Integer.MAX_VALUE; i++) {
			    sum += i;
			    //实际发生的操作
			    // long result = sum + i
			    // sum = new Long (result);
			}
			
			System.out.println("total:" + sum);
			System.out.println("processing time: " + (System.currentTimeMillis() - t) + " ms");
			
		}
		

		private static void uselong(){
			long t = System.currentTimeMillis();
			long sum = 0L;
			for (long i = 0; i < Integer.MAX_VALUE; i++) {
			    sum += i;
			}
			System.out.println("total:" + sum);
			System.out.println("processing time: " + (System.currentTimeMillis() - t) + " ms");
		}
}
