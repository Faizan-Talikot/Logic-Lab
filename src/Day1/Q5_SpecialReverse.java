package Day1;
import java.util.Scanner;

public class Q5_SpecialReverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();
        
        
        char[] arr = userString.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            if (!Character.isLetter(arr[left])) {
                left++;
            } 
            
            else if (!Character.isLetter(arr[right])) {
                right--;
            } 
            
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        
        String result = new String(arr);
        System.out.println("Your reversed String: " + result);
        
        sc.close();
    }
}