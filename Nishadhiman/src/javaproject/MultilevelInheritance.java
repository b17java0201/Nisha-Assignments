package javaproject;

class student
   {
	int roll_no;
	String name;
	

student(int r, String n)// constructor
   {
	roll_no = r;
	name = n;
  }
void displaystu()
  {
 	System.out.println("Roll_no= " + roll_no);
 	System.out.println("Name= "+ name);
  }
   }
class marks extends student
{
    int total;
	marks(int r, String n,  int t) 
	{
		super(r, n); // call student constructor
		total = t;
	
	}
	void displaymar()
	{
		super.displaystu(); // 
		System.out.println("total= "+ total);
	}
	}
class percentage extends marks
{
    int per;
	percentage(int r, String n, int t , int p)
	{

		super(r, n, t); //call marks constructor
		per = p;
	}
	void displayper()
	{
		
		 displaymar(); //its work without super
		 displaystu();// call student class constructor
		System.out.println("percentage= "+ per);
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
	
     percentage obj = new percentage(12 , "Nisha" , 350 , 70);
     obj.displayper();
     
	}

}
