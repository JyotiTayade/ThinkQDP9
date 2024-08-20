package com.Feb006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCollections 
{
	public static void main(String[] args) 
	{
		
		List<Custmore> cl=new ArrayList<Custmore>();
		
		cl.add( new Custmore(11,"Jyoti","Nashik"));
		cl.add( new Custmore(13,"Aarti","Pune"));
		cl.add( new Custmore(12,"Jay","Nagpur"));
		cl.add(new Custmore(10,"Puja","Delhi"));
		
		for(Custmore c:cl)
		{
			System.out.println(c);
		}
	
        //sort by Name
		System.out.println("======after sorting========");
		Collections.sort(cl);

        for (Custmore c : cl)
        {
            System.out.println(c);
        }
        System.out.println("after sorting by comparator");
        Collections.sort(cl,new Idcompare());
        for (Custmore c : cl)
        {
            System.out.println(c);
        }
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Apple");
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Orange");
		al.add("papaya");
		
		
		System.out.println(al);
		
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("==============");
		Collections.sort(al);
		for(String s:al)
		{
			System.out.println(s);
		}
		
	}

}
