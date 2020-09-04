package practice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num , i;
		 System.out.println("Enter number:" );
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		 num = scanner.nextInt();
		 
		
		
		System.out.println("Enter number:" + num);
		
		int fact =1;
		
		for( i = 1; i <= num ; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial for :" + num + "is" +fact );
		
	}

}
