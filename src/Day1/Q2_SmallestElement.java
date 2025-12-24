package Day1;

public class Q2_SmallestElement {

	public static void main(String[] args) {
		int[] arr = {10, -3, 25, 7, 0};
		int smallestElement = arr[0];
		for(int i : arr) {
			if(i<smallestElement) smallestElement = i;
		}
		System.out.println("The smallest element in the array is : "+smallestElement);
	}

}
