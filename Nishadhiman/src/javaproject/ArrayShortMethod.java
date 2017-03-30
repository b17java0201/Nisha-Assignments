package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShortMethod {

	public static void main(String[] args) {
		int n, max;
		System.out.println("How many Elements are you enter in aaray");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
        int ar[] = new int[n];
        System.out.println("enter element in array");

	    for(int i=0; i<n; i++)
	    {
	     ar[i] = in.nextInt();
         }
      Arrays.sort(ar); // sorting an array
      System.out.println(Arrays.toString(ar)); //print sorting int array
       int result=0;
		int avg=0;
		int arr[] = new int[]{3,34,46,5, 7,90,89,8};
		Arrays.sort(arr); 
      System.out.println(Arrays.toString(arr));
      String [] str = new String[]{"java", "c", "hello"};
      Arrays.sort(str); //sort char array
      System.out.println(Arrays.toString(str));
	for(int i= 0; i<arr.length; i++){
		result=result+arr[i]; //sum of Element in an array
		
	}
	System.out.println(result);
	for(int i=0; i< arr.length; i++){
		result = result+arr[i];
		avg=result/arr.length; //average of element in an array
	}
	System.out.println(avg);
	

	}

}
