package javaproject;

import java.util.Scanner;

public class studentGrade {

public static void main(String [] args){

	System.out.println("enter the marks");
	Scanner in = new Scanner(System.in);
	float marks = in.nextFloat();
	if(marks>=85 && marks <=100){System.out.println("student is Excellent");}
	else if(marks>70 && marks<85){System.out.println("Student is Very Good");}
	else if(marks>=50 && marks<=70){System.out.println("Student is Good");}
	else if(marks<40 && marks>=40){System.out.println("Student is Average");}
	else if(marks>100){System.out.println("invalid input");}
	else {System.out.println("falil");}
	}
}

