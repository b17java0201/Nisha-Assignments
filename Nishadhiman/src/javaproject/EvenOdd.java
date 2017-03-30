package javaproject;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number to check Even or Odd");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%2==0){
			System.out.println("Number is Even");}
			else 
				{System.out.println("Number is Odd");}
		

	}

}
