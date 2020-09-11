package practice;

public class ArrayMax {
	
	public static int max(int[] arr) {
		int max = 0;
		
		for(int i = 0; i< arr.length; i++) {
			
			if(arr[i] > max) {
				max =arr[i];
			}
			
		}
		
		return max;
		
	}
	
	public static void main(String args) {
		
		int arr[] = {5,8,9,10};
		int i = max(arr);
		
		System.out.println("Max value: " +i);
	}

}
