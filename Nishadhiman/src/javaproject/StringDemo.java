package javaproject;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = ("selenium");
		String s2 = ("SELENIUM");
		String s3 = ("selenium");
		String s4 = ("Testing");
		String s5 = ("  java use for selenium testing");
		long num = 93548848;
		String s = null;
		String s7 = ("   Hello Java");
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.compareTo(s2)); //return ASCII value
		System.out.println(s4.length()); //7
		System.out.println(s3.charAt(6)); // u return 6th char in string
		System.out.println(s4.indexOf("ting")); //3
		System.out.println(s1.lastIndexOf("ium")); //5
		System.out.println(s2.replace('S', 'T')); //TELENIUM
		System.out.println(s2.toLowerCase()); //selenium
		System.out.println(s4.toUpperCase()); //TESTING
		System.out.println(s1.substring(2, 6)); //leni
		String s6[] = s5.split(" for ");
		System.out.println(s6);
		System.out.println(s5.concat(" 3.0"));
		System.out.println(s5.contains("for")); //true boolean return
	     s = s.valueOf(num);
        System.out.println(s);
        System.out.println(s7.trim());
        char[]  ch = s1.toCharArray();
        for(int i=0; i<ch.length; i++){
        	System.out.println(ch[i]);
        	System.out.println(s1==s2);// false compare on address base
        	System.out.println(s1==s3); //true
        }
	}

}
