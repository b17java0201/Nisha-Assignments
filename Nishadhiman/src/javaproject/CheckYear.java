package javaproject;

import java.util.Scanner;

public class CheckYear {

	public static void main(String[] args) {
	 System.out.println("enter year to ckeck leap year or not ");
     Scanner in = new Scanner(System.in);
     int year = in.nextInt();
    /* if(year%4==0 || year%400==0){
    	 System.out.println(year+" is leap year");}
    	 else
    	 { System.out.println(year + " is not leap year");}
    */ // Another Method
     boolean flag= false;
     if(year %400==0){flag=true;}
     else if(year%100==0){flag=false;}
     else if(year%4==0){flag=true;}
     else{flag=false;}
     if(flag==true){System.out.println(year + " is a leap year");}
     else{System.out.println(year + " is not a leap year");}
     
	}

}
