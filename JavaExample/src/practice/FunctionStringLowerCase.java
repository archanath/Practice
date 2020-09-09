package practice;

public class FunctionStringLowerCase {
	
	public static String lowerCase(String st) {
		String strLowerCase = st.toLowerCase();
		
		System.out.println("Original Sentence : " + st);
		System.out.println("LowerCase Converted Sentence : " + strLowerCase);
		
		return st;
	}
	
	public static void main(String[] args) {
		
		String str = "LEARNING JAVA SELENIUM";
		
		String str1 = lowerCase(str);
	}

}
