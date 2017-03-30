package javaproject;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		System.out.println("Enter 1st number");
		Scanner in= new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = in.nextInt();
		System.out.println("sum of two number is "+ (num1-(-num2)));
		// Another Method
		while(num2!=0){
			int  carry = (num1&num2);
			num1= num1^num2;
			num2= carry<<1;
		}
      
		System.out.println("Sum of two Number is "+ num1);
	}

}
