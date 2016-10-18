package com.cyberdak.jdktest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {
	private static String test(String path){
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {  
			return br.readLine();  
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

	}
}
