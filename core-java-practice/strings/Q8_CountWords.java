package Day2;

import java.util.HashMap;
import java.util.Map;

public class Q8_CountWords {

	public static void main(String[] args) {
		String res = "Java is fun and Java is powerful";
		String[] arr = res.split(" ");
		HashMap<String,Integer> mp = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<String,Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
