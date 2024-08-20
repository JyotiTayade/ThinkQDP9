package com.Feb006;

import java.util.Arrays;
//output [1,2,4,6,7,8,0,0,0]
public class DemoArray 
{
	private static void shiftZeroright(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				
				arr[temp]=arr[i];
				temp++;
			}
		}
		while(temp<arr.length)
		{
			arr[temp]=0;
			temp++;
		}
		
	}

	public static void main(String[] args) 
	{
		int arr []= {1,2,0,4,0,6,7,0,8};
		System.out.println(Arrays.toString(arr));
		System.out.println("===shift zero at last===");
		shiftZeroright(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	

}
