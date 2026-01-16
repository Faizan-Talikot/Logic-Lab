package Day2;

public class Q4_ReverseSentence {
	
	
	
	public static void main(String[] args) {
		String res = "Java is fun";
		String[] words = res.split(" ");
		String finalres = "";
		for(String s: words) {
			StringBuilder reverseWord = new StringBuilder(s);
			reverseWord.reverse();
			finalres += reverseWord+" ";
		}
		System.out.println(finalres);
	}
	
}
