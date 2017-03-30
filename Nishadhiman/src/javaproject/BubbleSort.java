package javaproject;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int i , j,  temp=0;
		System.out.println("Input number of integer to sort");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("enter " + n + " integer");
        int arr[] = new int[n];
        for(i=0; i<n; i++)
        	arr[i] = in.nextInt();
        for(i=0; i<n; i++)
        {
        	for(j=0 ; j<n-i-1; j++){
        		if(arr[j]> arr[j+1]){
        			temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;
        			
        		}
        	}
        	
        }
        System.out.println("sorted list of number");
       for(i=0; i<n; i++)
        	System.out.println(arr[i]);
	}

}
