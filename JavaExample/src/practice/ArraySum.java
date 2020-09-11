package practice;

public class ArraySum {
	
	public static double sum(int arr[] ){
		
		double sum = 0;
		int a = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			a = a + arr[i];
			
			sum = a/arr.length;
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 4};
		
		double avg = sum(arr);
		
		System.out.println("Avg : " + avg);
		
	}

}
