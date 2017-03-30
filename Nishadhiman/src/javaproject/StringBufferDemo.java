package javaproject;

public class StringBufferDemo{

	public static void main(String[] args) {
	String s1 = new String("Java");
	StringBuffer sb1 = new StringBuffer(s1);
	StringBuffer sb2 = new StringBuffer("Project");
    sb1.append(sb2);
    System.out.println(sb1);
    System.out.println(sb1.capacity());
    sb1.delete(4, 6);
    System.out.println(sb1);
    sb1.insert(4, " for selenium testing");
    System.out.println(sb1);
    sb2.reverse();// reverse the string
    System.out.println(sb2);
    sb2.setCharAt(0,'B');// replace p with B
    System.out.println(sb2);
	}

}
