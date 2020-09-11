package practice;

public class SumArr {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5};
		int sum = 0;
		
		for(int i : arr) {
			
			sum = sum+i;
		}
		
		System.out.println(sum);
	}

}
