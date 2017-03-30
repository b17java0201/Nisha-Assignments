package javaproject;

import java.util.Scanner;

public class DimondPatern {

	public static void main(String[] args) {
		System.out.println("Enter how many lines are you print");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
       /*for (int i=1 ; i<=row ; i++){
            
    		for (int k=row-1; k>=i; k-- )
    			{System.out.print(" ");}
    	
    		for (int j = 1; j<=(2*i-1); j++)
    			
    			{System.out.print("*");}
                           
    		System.out.println();
    		
    	}*/
      for(int i=1; i<=row; i++){
    	  for(int k=1 ; k<=i; k++){System.out.print(" ");}
    	  for(int j=row+1; j>=(2*row-1); j++)
    	  {System.out.print("*");}
      }
    	   System.out.println();
    	   
       }
	}

