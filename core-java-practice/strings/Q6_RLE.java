package Day3;

import java.util.Scanner;

public class Q6_RLE {
	
	private static boolean isAllLetters(String s) {
        if (s.isEmpty()) return false;
        for (char ch : s.toCharArray()) {
            if (!Character.isLetter(ch)) return false;
        }
        return true;
    }
	
	private static boolean isValidEncoded(String s) {
        // Basic check: length must be even (Letter+Digit)
        if (s.length() < 2 || s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i += 2) {
            if (!Character.isLetter(s.charAt(i)) || !Character.isDigit(s.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
	
	private static String compress(String raw) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<raw.length();i++) {
			int count = 1;
			while(i+1 < raw.length() && raw.charAt(i) == raw.charAt(i+1)) {
				count++; i++;
			}
			sb.append(raw.charAt(i)).append(count);
		}
		return sb.toString();
	}
	
	private static String decompress(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i+=2) {
			char ch = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i+1));
			for(int j=0;j<count;j++) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- RLE COMPRESSOR MENU ---");
            System.out.println("1) Compress");
            System.out.println("2) Decompress");
            System.out.println("3) Exit");
            System.out.print("Enter choice: ");
            
            String choice = sc.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter string to compress (letters only): ");
                    String raw = sc.nextLine();
                    if (isAllLetters(raw)) {
                        System.out.println("Compressed: " + compress(raw));
                    } else {
                        System.out.println("Error: Input must contain only letters.");
                    }
                    break;
                    
                case "2":
                    System.out.print("Enter string to decompress (e.g., a3b2): ");
                    String encoded = sc.nextLine();
                    if (isValidEncoded(encoded)) {
                        System.out.println("Decompressed: " + decompress(encoded));
                    } else {
                        System.out.println("Error: Invalid RLE format.");
                    }
                    break;
                    
                case "3":
                    System.out.println("Exiting...");
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue; 
            }
        }

	}

	

	

}
