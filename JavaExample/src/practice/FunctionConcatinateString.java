package practice;

public class FunctionConcatinateString {
	
	public static String stringConcatinate(String st, String st1) {
		
		System.out.println(st);
		System.out.println(st1);
		
		String str2 = st.concat(st1);
		
		System.out.println("Concatened string:  " + str2);
		
		return st;
	}
	
	public static void main(String[] args) {
		
		String s, s1;
		
		s ="Java Practice";
		s1 = " and Selenium Practice";
		
		String str = stringConcatinate(s,s1);
		
		
	}

}
