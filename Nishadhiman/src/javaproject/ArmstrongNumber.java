package javaproject;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number, to check whether the number is Armstrong or not");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int length = 0;
       int num = number;
        while (num > 0)
        {
        	length += 1 ;
        	num = num/10;
        }
        
        int no = number;
        int sum=0;
        
        while(no>0)
        {
        	int x = no%10; 
        	int y=1;
        	for(int i=1; i<=length; i++)
        	{
        		y = x*y;
        		
        	}
        	sum = sum +y;
        	no = no/10;
        }
        
       if(sum==number)
       {
    	System.out.println(number+  " is a Armstrong Number");   
       }
       else
       {
    	   System.out.println(number +  " is not a Armstrong Number"); }
       // Another Method
       /* int nu = num;
       int rem=0; int add=0;
       while(nu>0){
    	  rem = nu%10;
    	   add = add+(rem*rem*rem);
    	   nu = nu/10;
       }
       if(num == add){
    	   System.out.println(num + " is a Armstrong Number");
       }
       else{
    	   System.out.println(num + " is not a Armstrong Number");
       }
*/	}

}
