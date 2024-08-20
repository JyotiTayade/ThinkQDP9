package com.Feb006;

public class Array2Ddemo
{
	public static void main(String[] args) 
	{
		int ar[][]= {{1,2,3,4},{5,6,7,8},{9,6,4,5}};
		
		System.out.println("2D Array is ...\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				//System.out.println("2D Array is ...");
				System.out.print(ar[i][j]+ " ");
			}
			
			System.out.println("  ");
		}
		
		//System.out.println(" " +ar[0][1]);
	}

}
