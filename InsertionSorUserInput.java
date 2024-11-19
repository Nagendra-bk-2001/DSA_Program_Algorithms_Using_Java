package com.DSA_Program;
import java.util.*;
public class InsertionSorUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the  Size of the element =: ");
		int[] arr = new int[sc.nextInt()];
		
		
		System.out.print("===================================================");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print("Enter the element " + (i+1) +  " =: ");
			arr[i] = sc.nextInt();
		}
		
		
		isInsertion(arr);
		
		System.out.print("===================================================");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("The sorted element in insertion sort is =: " + arr[i]);
		}

	}
	
	public static void isInsertion(int[] arr)
	{
		for(int i =1 ;i<arr.length;i++)
		{
			int current = arr[i];
			int j = i-1;
			
			while(j>= 0 && arr[j] > current)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
			
		}
		
	}

}
