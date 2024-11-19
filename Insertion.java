package com.DSA_Program;

public class Insertion {

	public static void main(String[] args) {
		
		int[] arr = {45,65,12,22,100,34,98,23};
		
		isInsertion(arr);
		
	}
	public static  void isInsertion(int[] arr)
	{
		for(int i = 1;i<arr.length;i++)
			{
				int current  = arr[i];
				int j = i-1;
				
				while(j>=0 && arr[j]>current)
				{
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = current;
			}
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Sorted of the arrays is  "+ arr[i]);
		}

		
	}
	
		

}
