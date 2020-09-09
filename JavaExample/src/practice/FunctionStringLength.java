package practice;

public class FunctionStringLength {
	
	public static String stringLen(String str, String str1) {
		
		System.out.println("Length of a String : " +str.length());
		System.out.println("Length of a String : " +str1.length());
		
		return str;
	}

	public static void main(String[] args) {
		
		String st = "Java Class";
		String st1 = "selineum class";
		
		String st2 = stringLen(st,st1);
		
	}
}
