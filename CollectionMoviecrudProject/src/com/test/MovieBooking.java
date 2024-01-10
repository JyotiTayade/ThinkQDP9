package com.test;

import java.util.List;
import java.util.Scanner;

import com.dao.MovieDaoImpl;
import com.pojo.Movie;

public class MovieBooking {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        MovieDaoImpl movieDao = new MovieDaoImpl();

        char ch;
        do {
            System.out.println("----- Movie Management System -----");
            System.out.println("1. Book Movie");
            System.out.println("2. Update Movie");
            System.out.println("3. Delete Movie");
            System.out.println("4. Show All Movies");
            System.out.println("5. Search Movie by Name");
            System.out.println("6. Exit");
            System.out.println("----------------------------------");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- Add Movie ---");
                    // Read movie details
                    System.out.println("Enter Movie TheaterName:");
                    String TheaterName = sc.next();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter Movie Name:");
                    String Name = sc.next();
                    System.out.println("Enter Time:");
                    double Time = sc.nextDouble();

                    // Create a new movie object
                    Movie newMovie = new Movie(TheaterName, Name, Time);
                    movieDao.addMovie(newMovie);
                    break;

                case 2:
                    System.out.println("--- Update Movie ---");
                    // Read movie ID to update
                    System.out.println("Enter Movie TheaterName:");
                    String TheaterName1 = sc.next();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter Movie Name:");
                    String Name1 = sc.next();
                    System.out.println("Enter Time:");
                    double Time1 = sc.nextDouble();
                   // Create a new movie object with updated details
                    Movie updatedMovie = new Movie(TheaterName1, Name1, Time1);
                    movieDao.updateMovie(updatedMovie);
                    break;

                case 3:
                    System.out.println("--- Delete Movie ---");
                    // Read movie ID to delete
                    System.out.println("Enter Movie Name to delete:");
                    String deleteId = sc.next();
                    Movie deleteMovie = new Movie("", "Name",0 );
                    movieDao.deleteMovie(deleteMovie);
                    break;

                case 4:
                    System.out.println("--- Show All Movies ---");
                    List<Movie> allMovies = movieDao.showList();
                    if (allMovies.isEmpty()) 
                    {
                        System.out.println("No movies available.");
                    } 
                    else 
                    {
                        for (Movie movie : allMovies) 
                        {
                            System.out.println(movie.getTheaterName() + " - " + movie.getName() +
                                    " - " + movie.getTime() );
                        }
                    }
                    break;

                case 5:
                    System.out.println("--- Search Movie by Name ---");
                    System.out.println("Enter Movie Name to search:");
                    sc.nextLine(); // Consume newline
                    String searchName = sc.nextLine();
                    Movie foundMovie = movieDao.searchEmployeeByName(searchName);
                    if (foundMovie != null) {
                        System.out.println(foundMovie.getTheaterName() + " - " + foundMovie.getName() +
                                " - " + foundMovie.getTime() );
                    } 
                    else 
                    {
                        System.out.println("Movie not found.");
                    }
                    break;

                case 6:
                	System.out.println("===Thank you for visit===");
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Do you want to continue? (Y/N)");
            ch = sc.next().charAt(0);
        } 
        while (ch == 'Y' || ch == 'y');
        sc.close();

	}

}
