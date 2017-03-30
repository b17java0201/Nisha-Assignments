package javaproject;
 class parent {
	 int age= 60;
	void calculate(int a, int b) //parent class method
	{ 
		int sum = a+b;
		System.out.println("parent class sum = "+ sum);
	}
   }
	class child extends parent  // inherit parent

	{
		int age=35;
	
    void calculate(int a, int b) // method overriding
	{   
    	super.calculate(30 ,20);
      	int mul = a*b;
		System.out.println("child class mul= "+mul);
		//System.out.println("child class age=" + age);
		//System.out.println("parent class age "+ super.age);
		//here super here work properly
			}

	}
	class derived extends child
	{ 
		int age = 7;
		void  calculate(int a, int b )
		{ 
			super.calculate(12, 12);
			System.out.println("derived class div= "+a/b);
			//System.out.println("derived class age= " +age);
			//System.out.println("child class age ="+ super.age);
			//System.out.println((super.(super.age)));
		}
	}

   public class InheritanceDemo{
	public static void main(String[] args)
	{
		
	 derived d = new derived();
	 d.calculate(24, 6);
     
     
	}


}