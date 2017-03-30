package javaproject;

import java.util.Scanner;

public class PrimeCalculator {

	public static void main(String[] args) {
		System.out.println("Enter the number, to check prime or not");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		boolean flag= true;
		for(int i=2; i<num; i++)
		if(num%i==0){
			flag=false;
			break;
		}
        if(flag==true){System.out.println("Number is Prime");}
        else{System.out.println("Number is not prime");}
        
        //Print prime  number 1 to 50
        int i ,j;
        for( i=1; i<=50; i++)
        {
        	for( j=2;j<i; j++)
        	{
        		if(i%j==0)
        		{break;}
        		
        	}
        	if(i==j)System.out.println(""+i);
        
	}
}

}