package javaproject;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int n, i, first, last, middle, search;
		System.out.println("Enter the number of Element");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+ n + "element");
		for(i=0; i<n; i++)
			arr[i] = in.nextInt();
		System.out.println("enter value to find");
		search = in.nextInt();
		first=0;
		last = n-1;
		middle= (first+last)/2;
		while(first<=last){
			if(arr[middle]<search){
			first = middle+1;
			}
			else if(arr[middle]==search){
				System.out.println(search + " found at location " + (middle+1));
				break;
			}
			else
				last = middle-1;
			middle =(first+last)/2;
			
		}
			
		
	if(first>last)
		System.out.println(search +" is not found");
	
	}

}
