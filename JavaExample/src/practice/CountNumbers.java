package practice;

import java.util.Scanner;

public class CountNumbers {
	
	public static void main(String[] args) {
		
		int countP = 0;
		int countN = 0;
		int countZ = 0;
		int i;
		int num;
		char choice;
		
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("enter no");
		num = scanner.nextInt();
		
					
			if(num < 0) {
				countP++;
			}
			if(num == 0) {
				countZ++;
			}if(num < 0)
			{
				countN++;
			}
			System.out.println("Do you want to continue: Y/N or y/n");
			
			choice = scanner.next().charAt(0);
		}while(choice == 'Y' || choice == 'y');
	
		
		
		System.out.println("Number of positive Nos :" + countP);
		
		System.out.println("Number of negative Nos :" + countN);
		
		System.out.println("Number of  zeros :" + countZ);
		
		
		
	}

}
