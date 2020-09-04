package practice;

import java.util.Scanner;

public class HelloJava {
public static void main(String[] args) {
		
		
		System.out.println("Enter Name:");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
		System.out.println("Hello Welcome to Java Selenium  " +name);
		
		
	}
}
