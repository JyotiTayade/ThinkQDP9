package com.Feb006;

abstract class Vehical 
{
	private int id;
	private String name;
    public final double price=10000;
	 String brandname;
	 
	 
	 Vehical()
	 {
		 id=1;
	 }
	 
	 
	
	
	
	 //abstract void move();
	 
 
}
interface Colorable 
{
	public int id=01;// only public ,final
	
	
	int a=1;
	void color();
}
//class Car implement Colorable
//{
//	
//}
class Car extends Vehical  implements Colorable
{
	public void color()
	{
		System.out.println("color of the car is red.");
	}
	void move()
	{
		System.out.println("car is moving.");
	}
}
