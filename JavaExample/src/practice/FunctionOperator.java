package practice;

public class FunctionOperator {
	
	public static int operEx(int a, int b) {
		
		System.out.println(a < b);
		System.out.println(a>b);
		int c = a+b ;
		
		System.out.println(c);
		
		c= a * b;
		System.out.println(c);
		
		c = a/b;
		System.out.println(c);
		
		c= a% b;
		System.out.println(c);
		
		c= b% a;
		System.out.println(c);
		
		
	System.out.println(a < b && a> b);
	
	System.out.println(a < b || a > b);
	
	
	int ch = 'a';
	
	System.out.println(ch);
	
	
	int ch1 = 'A';
	
	System.out.println(ch1);
	
		return a;
	}
	
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		int c = operEx(a,b);
		
		
	}
	
	

}
