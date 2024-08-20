package com.Feb006;

public class Demo2String
{
	//find vowels
	public static void findVowel1(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		   if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
		   {
			   //char ch=str.charAt(i);
			   System.out.println("\nvowels are =" +ch);
			
		   }
		}
		
		
	}
	//length of the word
	public static void findLengthwords(String str) 
	{
		String ar[]=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" = " +ar[i].length());
		
			
		}
		
	}
	//how many spaces in a string.
	//longest word in a string
	//frequency of char
	static void findFrequency(String st)
	{
		String starr[] = st.split("\\s");
		int count ;
		
		for(int i=0; i<starr.length; i++)
		{
			count =1;
			if(starr[i].equals("visited"))
				continue;
			for(int j=i+1; j<starr.length;j++)
			{
				if(starr[i].equalsIgnoreCase(starr[j]))
				{
					count++;
					starr[j] = "visited";
				}
			}
			
			//System.out.println("repeted word is  " +starr);
			System.out.println(starr[i]+ ": " +count);
		}
	}

	//palinndrom string
	public static void findPalindrom(String str)
	{
		
	  String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}
	//find spaces
	public static int countSpaces(String str)
	{
		 int spaceCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isWhitespace(str.charAt(i))) {
	                spaceCount++;
	            }
	        }

	        return spaceCount;
	}
	//find longest word
	
	public static void findLongestWord(String str) 
	{
        String[] words = str.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("Longest word: " + longestWord);
    }
	public static void main(String[] args) 
	{
		String str="good morning madam";
		
		
		System.out.println(str);
		
		System.out.println(str.length());
		   int n = str.length();
		   
		for(int i=n-1;i>=0;i--)
		{
			char ch=str.charAt(i);
		  System.out.print(ch);
		  //System.out.print("\n===============");
		}
		System.out.print("\n===============");
//		findVowel1(str);
//		findLengthwords(str);
//		findPalindrom(str);
//		findFrequency(str);
		findLongestWord(str);
		System.out.println("====================");
		
		int spaces = countSpaces(str);
        System.out.println("Number of spaces: " + spaces);
	}
	

	

}
