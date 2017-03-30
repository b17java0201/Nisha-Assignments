package javaproject;

import java.util.Scanner;

public class VowelCounter {
	public static void main(String[] args) {
 		char s2; int vowel=0;
System.out.println("Enter the String");
Scanner in = new Scanner(System.in);
   String s1 = in.nextLine();
   s1=s1.toLowerCase();
for(int i=0; i<=s1.length()-1; i++){
	s2= s1.charAt(i);
		if(s2=='a' || s2=='e' || s2=='i' || s2=='o' || s2=='u'){
			vowel++;
			
		}
		
	}
System.out.println("vowel in a string is = "+ vowel);
}
}
