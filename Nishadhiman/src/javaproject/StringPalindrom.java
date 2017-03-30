package javaproject;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		
		
    String s1="";
	System.out.println("Enter the String, to check string is palindrome or not ");
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	s= s.toLowerCase();
	for(int i= s.length()-1; i>=0; i--)
	{
	s1 = s1 + s.charAt(i)	;
	}
	System.out.println(s1);
    if(s1.equals(s))
        System.out.println("String is Palindrome");
    
        else
    	System.out.println("String is not palindrome");
    

 }
}
