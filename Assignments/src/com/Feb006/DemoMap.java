package com.Feb006;

import java.util.HashMap;
import java.util.Map;

public class DemoMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(11, "Aa");
		hm.put(12, "Ba");
		hm.put(13, "Ca");
		hm.put(14, "Da");
		hm.put(15, "Ea");
		hm.put(13, "gg");
		hm.put(null, "Hh");
		
		System.out.println(hm);
		
		 for (Map.Entry<Integer, String> entry : hm.entrySet()) 
		 {
	            System.out.println(entry.getKey() + "==" +entry.getValue());
	            //System.out.println(entry.getValue()); 
	      }
		
		
		
	}

}
