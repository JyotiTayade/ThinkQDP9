package com.Feb006;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 
{
	public void checkAge(int age) throws ArithmeticException{
		if(age<35) {
			throw new ArithmeticException("age should be greater than 35");
		}
		else {
			System.out.println("Welcome");
		}
		
	}
	public void m1() throws IOException {
		FileWriter fw=new FileWriter("abc.txt");
	}
	
	public void m2() throws IOException{
		m1();
	}
	public static void main(String[] args) {
			
		int age=25;
		Test2 t=new Test2();
		try {
			t.checkAge(age);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("thnak you");
		
		try {
			t.m2();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
