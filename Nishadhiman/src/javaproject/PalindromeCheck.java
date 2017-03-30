package javaproject;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
	  System.out.println("Enter the number to check, number is Palindrome or not");
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int no = num;
      int carry= 0;
      while(no != 0){
    	  carry = carry*10;
    	  carry = carry + no%10;
    	  no = no/10;
    	  
      }
    	  if(num==carry){
    		  System.out.println(num + " is a Palindrome Number");
    	  }
    	  else{
    		  System.out.println(num +" is not a Palindrome Number");
    	  }
	}

}
