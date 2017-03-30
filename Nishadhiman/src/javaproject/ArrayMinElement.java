package javaproject;

import java.util.Scanner;

public class ArrayMinElement {

	public static void main(String[] args) {
		int n, min;
		System.out.println("How many Element are you Enter in an Array ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in an array");
        for(int i=0; i<n; i++){
        	arr[i] = in.nextInt();
        }
        min = arr[0];
        for(int i=0; i<n; i++){
        	if(min>arr[i])
        		min=arr[i];
        }
        System.out.println("Minimum Element in array is " + min);
	}
	

}
