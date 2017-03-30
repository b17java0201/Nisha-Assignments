package javaproject;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int i , j, loc=0, min =0;
		System.out.println("Input number of integer to sort");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Enter "+ n + " Integer");
		int arr[] = new int[n];
		for(i =0; i<n; i++)
			arr[i]= in.nextInt();
		for(i=0; i<n; i++)
		{
			loc = i;
		
			for(j =i+1; j<n; j++ )
			{
				if(arr[j]<arr[loc])
				{
				loc = j;	
				}
				
			}
			min = arr[i];
			arr[i]= arr[loc];
			arr[loc]= min;
		}
		System.out.println("After Swapping");
     for(i= 0; i< n; i++)
	System.out.println(arr[i]);
	}

}
