package practice;

public class ConcatinateStrings {

	public static void main(String[] args) {
		
		String str = "Java Practice";
		String str1 = " And Selenium Practice";
		
		System.out.println(str);
		System.out.println(str1);
		
		String str2 = str.concat(str1);
		
		System.out.println("Concatened string:  " + str2);
	}
}
