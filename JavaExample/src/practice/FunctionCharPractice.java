package practice;

public class FunctionCharPractice {
	
	public static  String charFun(String s) {

		System.out.println("Original Sentence: " + s);
		
		int i = s.charAt(0);
		int i1 = s.charAt(9);
		
		System.out.println("The character at index 0 is :" + (char)i);
		System.out.println("The character at index 9 is :" + (char)i1);
		return s;
	}

	public static void main(String[] args) {
		
		String str = charFun("JavaSelenium");
	}
}
