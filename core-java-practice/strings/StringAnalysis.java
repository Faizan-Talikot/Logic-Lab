package core.java.practice.strings;

import java.util.Scanner;

public class StringAnalysis {
	
	private static void analyzeText(String str) {
		int numberOfWords = 0,sentenceCount = 0, digits = 0, letter = 0;
		String longestWord = "";

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == ' ') continue;
			numberOfWords++; //Counts number of words
			StringBuilder currentWord = new StringBuilder(); 
				while(i<str.length() && str.charAt(i) != ' ') {
					char currentCh = str.charAt(i);
					
					//Count Sentences
					if(currentCh == '.' || currentCh == '!' || currentCh == '?') sentenceCount++;
					
					//Count Letter/Digits				
					if(Character.isDigit(currentCh)) digits++;
					else if(Character.isLetter(currentCh)) {
						letter++;
						currentWord.append(str.charAt(i));
					}
					
					i++;
				}
				//Track Longest Word
				if(currentWord.length() > longestWord.length()) longestWord = currentWord.toString();
			  
		}
		System.out.println("Words: " + numberOfWords);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Digits: " + digits + ", Letters: " + letter);
        System.out.println("Longest word: \"" + longestWord + "\"");
        
        int[] vowelFreq = countVowels(str);
        char[] vowelChars = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Vowel freq: ");
        for (int j = 0; j < vowelFreq.length; j++) {
            System.out.print(vowelChars[j] + "=" + vowelFreq[j] + (j == 4 ? "" : " "));
        }
        System.out.println();
	}
	
	private static int[] countVowels(String s) {
		int[] counts = new int[5];
		String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a') counts[0]++;
            else if (ch == 'e') counts[1]++;
            else if (ch == 'i') counts[2]++;
            else if (ch == 'o') counts[3]++;
            else if (ch == 'u') counts[4]++;
        }
        return counts;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
		    System.out.println("Enter text:");
		    str = sc.nextLine();
		} while (str.isEmpty());

		analyzeText(str);
	}

	

}
