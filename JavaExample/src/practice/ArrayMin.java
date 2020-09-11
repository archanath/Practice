package practice;

public class ArrayMin {
	
	public static int min(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,8,2,10};
		int i = min(arr);
		
		System.out.println("Min value: " +i);
		
	}

}
