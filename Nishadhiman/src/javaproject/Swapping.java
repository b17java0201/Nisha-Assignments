package javaproject;

import java.util.Scanner;

public class Swapping {
   public static void main(String [] args){
	   System.out.println("Enter 1st numner");
	   Scanner in = new Scanner(System.in);
	   int num1 = in.nextInt();
	   System.out.println("Enter 2nd number");
	   int num2 = in.nextInt();
	   System.out.println("Number before Swapping "+ "num1= "+ num1+ " "+ "num2= " + num2);
/*	   int temp = num1;
	   num1 = num2;
	   num2 = temp;
	   System.out.println("Number after Swapping "+num1+" " + num2);
*/	   // Another Method
	   
		   num1= num1+num2;
		   num2=num1-num2;
		   num1= num1-num2;
		   System.out.println("after swapping " + "num1= " +num1 + " "+"num2= "+ num2);
	   }
	 }

