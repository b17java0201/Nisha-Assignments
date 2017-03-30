package javaproject;

public class ArrayPattern {

	public static void main(String[] args) {
		int arr [][]= {
				      new int[] {12345 },
		              new int[] {2345},
		              new int[] {345},
		              new int[] {45},
		              new int[] {5}
		                };
		for(int i=0; i<5; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
			
		}
	}                

}
