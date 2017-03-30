package javaproject;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++)
			if(i==5)
				break;
			else
				System.out.println(i);
// continues statement
		for(int i=0; i<=10; i++)
			if(i==5)
				continue;
			else
				System.out.println(i);
		// we use != operator
		
		for(int i=0; i<=10; i++){
			
			if(i!=5 && i!=7)
			{System.out.println(i);}
			
		}
				
	}

}
