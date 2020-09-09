package practice;

public class FunctionSpecifiedString {
	
	public static void specifiedString() {
		
		String str = "Specified sequence of a char values";
		String str1 = "char";
		
		System.out.println("Original String : " + str);
		System.out.println("Specified String : " + str1);
		System.out.println(str.contains(str1));
	}

	public static void main(String[] args) {
		specifiedString();
	}
}
