package javaproject;
public class MovieDetail {
String Name;
 String Actor;
 int Rating;
 static final String Language = "Hindi";
 void display(){
	 
		 System.out.println("Movie " +" "+ Name +" "+ "Actor "+Actor +" MovieLanguage "+ Language + " MovieRating "+Rating+" Star");
	 }
 
 
	public static void main(String[] args) {
		 MovieDetail s1 = new MovieDetail();
		 MovieDetail s2 = new MovieDetail();
		 MovieDetail s3 = new MovieDetail();
		 s1.Name="Shivay";
		 s1.Actor="Ajay Devgan";
		 s1.Rating=3;
		 s2.Name="Baahubal2";
		 s2.Actor="Prabhas";
		 s2.Rating=4;
		 s3.Name="Commando";
		 s3.Actor="Vidyut";
		 s3.Rating=3;
         s1.display();
         s2.display();
         s3.display();

	}

}
