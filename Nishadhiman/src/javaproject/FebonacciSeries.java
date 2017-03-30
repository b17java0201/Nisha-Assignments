package javaproject;

public class FebonacciSeries {

	public static void main(String[] args) {
		int num1=0, num2=0, sum=1;
		for(int i=0; i<=15; i++){
			num1 = num2;
			num2 = sum; 
			sum = num1+num2;
			System.out.println(sum);
		}
        
	}

}
