package practice;

public class FunctionCompareStrings {
	
	public static String stringCompare(String str, String str1) {
		
		if(str.equals(str1)) {
			System.out.println("Equal");		
			}
		else {
		System.out.println("Not Equal");
	}
		return str;
	}
	
	public static void main(String[] args) {
		
		String st = "Java Selenium";
		String st1 = "Java Selenium";
		
		String s = stringCompare(st,st1);
		

		
	}

}
