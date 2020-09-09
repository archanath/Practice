package practice;

public class FunctionStringUpperCase {
	
	public static String upperCase(String str) {
		
		String strUpperCase = str.toUpperCase();
		
		System.out.println("Original Sentence : " + str);
		System.out.println("UpperCase Converted Sentence : " + strUpperCase);
		
		return str;
	}
	
	public static void main(String[] args) {
		
		String st ="Learning java selenium";
		
		String st1 = upperCase(st);
		
	}

}
