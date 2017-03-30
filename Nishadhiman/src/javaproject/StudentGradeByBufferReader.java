package javaproject;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class StudentGradeByBufferReader {
	  String name="";
	  float marks;
	  int roll_no;
	  static String course= "java";
	 void getdata()throws IOException{
			InputStreamReader r= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		// this line meaning is same as above 2 lines
			System.out.println("Enter student roll_no");
				roll_no=Integer.parseInt(br.readLine());
			System.out.println("Enter student name");
				 name = br.readLine();
				System.out.println("Enter student marks");
				 marks=Float.parseFloat(br.readLine());
		
		 
	 }
	 void display()throws IOException{
		System.out.println("rollno="+roll_no+ " name=" +name+ " marks= "+ marks+" course= " +course); 
		 
	 }
	void grade()throws IOException
	{
	   if(marks>=75 && marks<=100){
		   System.out.println(name+ " is Excellent");}
	  else if (marks>=60 && marks<75){
		  System.out.println(name + " is Good");}
	   else if(marks>=40 && marks<60){
		  System.out.println(name + " is Average");}
	  else{
		   System.out.println(name+ "is Fail");}
	}
		public static void main(String[] args)throws IOException {
			StudentGradeByBufferReader s = new StudentGradeByBufferReader();
			StudentGradeByBufferReader s1 = new StudentGradeByBufferReader();
			StudentGradeByBufferReader s2 = new StudentGradeByBufferReader();
			 s.getdata();
			 s1.getdata();
			 s2.getdata();
			 s.display();
			 s1.display();
			 s2.display();
		     s.grade();
	         s1.grade();
	         s2.grade();
	         

	       
		}

	}





