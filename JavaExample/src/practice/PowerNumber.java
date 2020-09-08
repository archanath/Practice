package practice;

import java.util.Scanner;

public class PowerNumber {
	
	public static void main(String[] args) {
		
		int num, num1;
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		
		
		
		System.out.println("Enter 1 st number:");
		num = scanner.nextInt();
		System.out.println("Enter 2 nd number:");
		num1 = scanner1.nextInt();
		
		int no = 1;
		
		for(int i =1; i<= num1; i++) {
			no = no * num;
		}
		System.out.println(no);
	}

}
