package javaproject;

public class CalculateArea {
	
	int length,  breadth;
    double l;
    static double pie = 3.14; //use of static
	
   double circlearea (int radius) //method
   {
		   
		double area;
	  return area = pie*radius*radius;
	
   }
	
   double circlearea(double radius) //method overloading
   {
	  double perimeter = 2*pie*radius;
	  return perimeter;
	   
   }
   
   CalculateArea(int length , int breadth) //constructor
   {
	 
	   this.length= length; // use of this keyword 
	  this.breadth = breadth;
   }
   
   void display()
   {
	   int area = length*breadth;
	   System.out.println("area of ractangle = "+ area);
	   
   }
   
   CalculateArea(double length , int breadth ) //constructor overloading
   {
	 this.l=length;
	 this.breadth=breadth;
	   double perimeter = 2*(length+breadth);
	   System.out.println("perimeter of ractangle = "+perimeter);
   }
	
	public static void main(String[] args)
	{
		
	 CalculateArea obj = new CalculateArea (8 , 9 );
	 System.out.println("length of ractangle is= "+obj.length);
	 System.out.println("breadth of ractangle is= " +obj.breadth);
	 obj.display();
	 
	 CalculateArea obj1 = new CalculateArea(6.6, 7);
	 System.out.println("length of ractangle is = " + obj1.l);
	 System.out.println("breadth of ractangle is= " + obj1.breadth);
	 System.out.println("Perimeter of circle is= " +obj1.circlearea(20.30));
	 System.out.println("Area of circle is= "+ obj.circlearea(3));
	}

}
