package com.Feb006;

interface Flyable 
{
    void fly_obj();
}


class Spacecraft implements Flyable 
{
    @Override
    public void fly_obj() 
    {
        System.out.println("Spacecraft is flying through space.");
    }
}


class Airplane implements Flyable 
{
    @Override
    public void fly_obj() 
    {
        System.out.println("Airplane is flying in the sky.");
    }
}


class Helicopter implements Flyable 
{
    @Override
    public void fly_obj() 
    {
        System.out.println("Helicopter is hovering in the air.");
    }

    public static void main(String[] args) 
    {
       
        Flyable spacecraft = new Spacecraft();
        spacecraft.fly_obj();

        Flyable airplane = new Airplane();
        airplane.fly_obj();

        Flyable helicopter = new Helicopter();
        helicopter.fly_obj();
    }
}
