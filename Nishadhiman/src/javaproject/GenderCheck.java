package javaproject;

import java.util.Scanner;

public class GenderCheck {

	public static void main(String[] args) {
		System.out.println("enter gender");
		Scanner in = new Scanner(System.in);
		char gen = in.next().charAt(0);
        System.out.println("enter age");
        int age = in.nextInt();
        if(gen=='m' && age>=21){System.out.println("gender is Male and eligible for merrage");}
        else if(gen=='f' && age>=18){System.out.println("Gender is Female and eligible for merrage");}
        else if(gen=='m' && age<21){System.out.println("Gender is Male and Not eligible for merrage");}
        else if(gen=='f' && age<18){System.out.println("Gender is Female and Not eligible for merrage");}
	}

}
