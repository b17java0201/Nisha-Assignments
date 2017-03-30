package javaproject;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.println("Enter element in array at " + i +" index");
			arr[i] = in.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println("Element at " +i+" index in array is "+ arr[i]);
		}

	}

}
