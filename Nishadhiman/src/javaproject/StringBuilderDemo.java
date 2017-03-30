package javaproject;

public class StringBuilderDemo {

	public static void main(String[] args) {
	StringBuilder sb1 = new StringBuilder("micro");
	sb1.append("soft");
	System.out.println(sb1);
    sb1.insert(0, "company");//companymicrosoft
    System.out.println(sb1);
    sb1.replace(1, 4, "java");//cjavaanymicrosoft
    System.out.println(sb1);
    sb1.delete(1, 4);
    System.out.println(sb1);//caanymicrosoft
    sb1.reverse();
    System.out.println(sb1);//tfosorcimynaac
	}

}
