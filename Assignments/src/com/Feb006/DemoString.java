package com.Feb006;

import java.util.Scanner;

public class DemoString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
		
		String name=sc.next();
		
		System.out.println("==============================");
		String str1 ="jjs";
		String str2 ="Jay";
		
		
		System.out.println("1st string is=> " +str1);
		System.out.println("2nd string is=>" +str2);
		System.out.println("user string is=> " +name);
		System.out.println("length of str1=> " +str1.length());
		System.out.println("join 2 string=> " +str2.concat(str1));
		System.out.println("================================");
		
		System.out.println(str2.substring(0,3));
		
	}

}
