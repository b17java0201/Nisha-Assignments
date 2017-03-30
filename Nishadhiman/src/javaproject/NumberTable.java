package javaproject;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		System.out.println("Enter number, to print the table of that number");
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        for(int i=1; i<=10; i++)
        {
        	int sum = num*i;
        	System.out.println(sum);
        }
	}

}
