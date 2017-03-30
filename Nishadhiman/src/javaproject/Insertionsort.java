package javaproject;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		int i , j, temp=0;
	System.out.println("Input number of integer to sort");
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	System.out.println("Enter "+ n + " Integer");
	int arr[] = new int[n];
	for(i = 0; i<n; i++)
      arr[i]= in.nextInt();
	for(i=0; i<n; i++){
		j=0;
		while((arr[j]>arr[j+1]) && j>-1 ){
			temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1]= temp;

			j--;
			
		}
		
	
	}
	System.out.println("After sorting");
	for(i=0; i<n; i++)
		System.out.println(arr[i]);
	}

}
