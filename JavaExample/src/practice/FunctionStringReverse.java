package practice;

import java.util.Scanner;

public class FunctionStringReverse {
	
	public static void stringRev() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse: ");
		
		String str = scanner.nextLine();
		
		
		String rev =" ";
		
		
		System.out.println(str);
		System.out.println("Reverse String: ");
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			rev = rev+str.charAt(i);
			
		}
		
		System.out.print("reverse String: " + rev);
	}
	
	public static void main(String[] args) {
		
		stringRev();
	}

}
