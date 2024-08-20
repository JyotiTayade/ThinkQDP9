package com.Feb006;

import java.util.ArrayList;

public class DemoCollection1 
{
	public static void main(String[] args) 
	{
		 int[] array = new int[3]; // Fixed size array
	        array[0] = 1;
	        array[1] = 2;
	        array[2] = 3;
	        //array[3] = 4;

	        // Collection declaration and initialization
	        ArrayList<Integer> list = new ArrayList<>(); // Dynamic size collection
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);

	        // Difference 1: Fixed Size vs. Dynamic Size
	        System.out.println("Array size: " + array.length); // Fixed size
	        System.out.println("Collection size: " + list.size()); // Dynamic size
		
	}

}
