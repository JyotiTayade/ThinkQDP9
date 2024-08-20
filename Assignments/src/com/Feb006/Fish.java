package com.Feb006;
//3      Create class Fish { String name , int gills  } . Class Fish has method void swim() which has some default implementation. 
//Create two subclasses of Fish , GoldFish and Whale. 
//Override swim method in GoldFish by changing access modifier and Override in Whale class by changing its return type.

class Fish
{
    String name;
    int gills;

    
    public Fish(String name, int gills)
    {
        this.name = name;
        this.gills = gills;
    }

    
    protected void swim()
    {
        System.out.println("Fish is swimming");
    }
}


class GoldFish extends Fish 
{
   
    public GoldFish(String name, int gills)
    {
        super(name, gills);
    }

   
    public void swim()
    {
        System.out.println("GoldFish is swimming");
    }
}


class Whale extends Fish
{
    
    public Whale(String name, int gills) 
    {
        super(name, gills);
    }

 


    public static void main(String[] args)
    {
        GoldFish goldFish = new GoldFish("Goldie", 2);
        goldFish.swim(); 

        Whale whale = new Whale("Willy", 4);
       
    }
}