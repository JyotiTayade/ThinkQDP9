package com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pojo.Movie;



public class MovieDaoImpl implements MovieDao
{

	List<Movie> elist=null;
	Movie eobj=null;
	public MovieDaoImpl() 
	{
		elist=new ArrayList<Movie>();
	}
	
	@Override
	public void addMovie(Movie mov) 
	{
		 elist.add(mov);
		
		
	}
	@Override
	public void updateMovie(Movie mov)
	{
		for (Movie movie : elist) 
		{
            if (movie.getName().equals( mov.getName()))
            {
                movie.setName(mov.getName());
               // movie.setDirector(mov.getDirector());
                //movie.setYear(mov.getYear());
                System.out.println("Movie updated successfully: " + movie.getName());
                return;
            }
        }
        System.out.println("Movie not found for update.");
		
		
	}
	@Override
	public void deleteMovie(Movie mov) 
	{
		Iterator<Movie> iterator = elist.iterator();
        while (iterator.hasNext())
        {
        	System.out.println("Yes we found this movie ...Do you want to delete it?...");
            Movie movie = iterator.next();
            if (movie.getName().equals( mov.getName()))
            {
            	//System.out.println("Yes we found this movie ...Do you want to delete it?...");
                iterator.remove();
                System.out.println("Movie deleted successfully: " + movie.getName());
                return ;
            }
        }
        System.out.println("Movie not found for deletion.");
		
		
	}
	@Override
	public List<Movie> showList()
	{
		 return elist;
		//return null;
	}
	@Override
	public Movie searchEmployeeByName(String name) 
	{
		for (Movie movie : elist) 
		{
            if (movie.getName().equalsIgnoreCase(name))
            {
                return movie;
            }
        }
        
		
		return null;
	}
	
}
