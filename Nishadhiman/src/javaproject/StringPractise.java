package javaproject;

public class StringPractise {

	public static void main(String[] args) {
		/*String str = "StudyToNight";
		str.concat(".com");
		str = str.toUpperCase();
		str.replace("TONIGHT", "tonight");
		System.out.println(str);
		System.out.println(str.replace("TONIGHT", "tonight"));
		*/
		String str1 = "java Learners";
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str1.length(); i++){
			sb.append(str1.charAt(i));
			System.out.println(sb);
			
		}
		


	}}
