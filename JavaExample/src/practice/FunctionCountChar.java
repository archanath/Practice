package practice;

public class FunctionCountChar {
	
	public static String charCount(String st) {
		
		int count = 0;
		
		for(int i = 0; i< st.length(); i++) {
			if(st.charAt(i) != ' ') 
				count++;
			
		}
		System.out.println("Total number of characters in a string: " + count);
		
		
		return st;
	}
	
	public static void main(String[] args) {
		
		String s = "Count Character Practice"; 
		
		String s1 = charCount(s);
		
	}

}
