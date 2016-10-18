package com.cyberdak.jdktest;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Stream 
{
	public void stream(){
		List<String> list = new ArrayList<>();
		list.stream().filter(str -> str != null).count();
	}

	public void tldr(){
		List<String> list = new ArrayList<String>();
		list.add("TaoBao");
		list.add("ZhiFuBao");
		list.add(null);
		//不得不产生一个中间量来保存和统计
		List<String> temp = new ArrayList<String>();
		for (String name : list) {
			if(name != null){
				temp.add(name);
			}
		}
		temp.size();
	}
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
