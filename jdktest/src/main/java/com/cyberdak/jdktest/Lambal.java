package com.cyberdak.jdktest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sun.applet.Main;

public class Lambal {
	private static void sort(){
		List<String> list = new ArrayList<>();
		list.add("b");
		list.add("a");
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		list.stream().map(name -> name.toString()).forEach(System.out::println);;

		list.stream().forEach(System.out::println);;
		
		list.forEach(System.out::println);
		
		list.forEach(player -> System.out.println(player));
	}
	
	private static void past(){
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		
		Collections.sort(list, new Comparator<String>() {
			  @Override
			  public int compare(String o1, String o2) {
			    return o1.compareTo(o2);
			  }
			});
	}
	
	public static void main(String[] args) {
		sort();
	}
	
	private static void runnableNewStyle(){
		Runnable r = () -> System.out.println("a");
	}
	
	private static void threadNewStyle(){
		new Thread(() -> System.out.println("a")).start();
	}
	
	private static void runnableOldStyle(){
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("a");
			}
		};
	}
	
	
	private static void threadOldStyle(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("a");
				
			}
		}).start();
	}
}
