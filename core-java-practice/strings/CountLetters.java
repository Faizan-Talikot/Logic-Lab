package strings;

import java.util.HashMap;
import java.util.Map;

public class Q4_countLetters {

	public static void main(String[] args) {
		String s = "bab!!";
		HashMap<Character,Integer> mp = new HashMap<>();
		char[] ch = s.toCharArray();
		for(char i: ch) {
			if(i >= 'a' && i <= 'z') {
				mp.put(i, mp.getOrDefault(i, 0)+1);
			}
		}
		for(Map.Entry<Character,Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
