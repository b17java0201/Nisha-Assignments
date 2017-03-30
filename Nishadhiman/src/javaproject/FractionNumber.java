package javaproject;

import java.util.Scanner;

public class FractionNumber {

	public static void main(String[] args) {
		System.out.println("Enter the 1st number");
		Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = in.nextInt();
        while(num1!=0 && num2!=0)
        {
        	if(num1>num2){
        	num1= num1%num2;
        	System.out.println(num1);}
        	else
               num2= num2%num1;		
        	System.out.println(num2);
        }
	}

}
