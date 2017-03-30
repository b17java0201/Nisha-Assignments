package javaproject;

import java.util.Scanner;

public class ArrayMaxELement {

	public static void main(String[] args) {
		int n, max;
		System.out.println("How many Elements are you enter in aaray");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element in array");

	    for(int i=0; i<n; i++)
	    {
	     arr[i] = in.nextInt();
         }
	    max= arr[0];
	    for(int i=0; i<n; i++)
	    {
	      if(max<arr[i])
	    	max=arr[i];
	    	
	     }
	 	System.out.println("Highest element in array is "+max);
	}

}
