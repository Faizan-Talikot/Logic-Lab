package Day2;

public class Q5_secondLargest {

	public static void main(String[] args) {
		int[] arr = {10, 25, 7, 30, 15};
		
		int firstlarge = Integer.MIN_VALUE, secondlarge = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > firstlarge) {
				secondlarge = firstlarge;
				firstlarge = arr[i];
			}
			else if(arr[i]>secondlarge) {
				secondlarge = arr[i];
			}
		}
		System.out.println("Second largest element is: "+secondlarge);
	}

}
