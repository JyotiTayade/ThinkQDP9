package com.Feb006;

class BooknotFound extends Exception
{
	String message;
	
	
	BooknotFound(String message)
	{
		super(message);
	}
	
	
}

class Book
{
	public void checkBookid(int bookid) throws BooknotFound
	{
		if(bookid<100)
		{
			throw new BooknotFound("book id is not correct");
		
		}
	}
}
public class CustomException 
{
    public static void main(String[] args)
    {
    	Book b = new Book();
    	
    	try
    	{
    	b.checkBookid(11);
    	}
    	catch(BooknotFound e)
    	{
    		System.out.println(e);
    	}
		
	}
}
