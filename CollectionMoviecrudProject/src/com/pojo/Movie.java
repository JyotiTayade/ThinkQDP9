package com.pojo;

public class Movie 
{
	 private String theaterName;
	    private String name;
	    private double time;

	    

		public Movie(String theaterName, String name, double time)
		{
			super();
			this.theaterName = theaterName;
			this.name = name;
			this.time = time;
		}

		public String getTheaterName()
	    {
	        return theaterName;
	    }

	    public void setTheaterName(String theaterName)
	    {
	        this.theaterName = theaterName;
	    }

	    public String getName() 
	    {
	        return name;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }

	    public double getTime()
	    {
	        return time;
	    }

	    public void setTime(double time)
	    {
	        this.time = time;
	    }

		@Override
		public String toString() 
		{
			return "Movie [theaterName=" + theaterName + ", name=" + name + ", time=" + time + "]";
		}
	}