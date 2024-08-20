package com.Feb006;
//     Write a main method in which you accept values from user to create 3 objects of cricketer and display them. 
//To display method you should use tostring method.

import java.util.Scanner;

public class Cricketer
{
	   private String name;
	   private int age;
	   private String team;

	    Cricketer()
	    {
	    	
	    }
	    public Cricketer(String name, int age, String team)
	    {
	        this.name = name;
	        this.age = age;
	        this.team = team;
	    }
	    

	    
	    public String getName()
	    {
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public int getAge() 
		{
			return age;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
		public String getTeam() 
		{
			return team;
		}
		public void setTeam(String team)
		{
			this.team = team;
		}
		@Override
	    public String toString() 
	    {
	        return "Cricketer [Name: " + name + ", Age: " + age + ", Team: " + team + "]";
	    }
	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);


	        Cricketer cr = new Cricketer(null, 0, null);
            System.out.println(cr.toString());
            
	        for (int i = 0; i < 3; i++) 
	        {
	            System.out.println("Enter details for Cricketer " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            System.out.print("Team: ");
	            String team = scanner.nextLine();

	        }

	        
	        scanner.close();
	    }
	}


