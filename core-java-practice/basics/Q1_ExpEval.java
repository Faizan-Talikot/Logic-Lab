package Day3;

import java.util.Scanner;
import java.util.Stack;

public class Q1_ExpEval {
	
	//finds the precedence of the operator
	private static int precedence(char op) {
		if(op == '*' || op == '/') return 2;
		else  return 1;
	}
	
	//calculates the result for the given operator
	private static int applyOp(char op, int b, int a) {
	    switch (op) {
	        case '+': return a + b;
	        case '-': return a - b;
	        case '*': return a * b;
	        case '/': 
	            if (b == 0) {
	                System.out.println("Error: Division by zero");
	                System.exit(0);
	            }
	            return a / b;
	    }
	    return 0;
	}
	
	private static int evaluate(String exp) {
		Stack<Integer> numSt = new Stack<>(); //stack to store number
		Stack<Character> charSt = new Stack<>(); //stack to store operator
		
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch==' ') continue;
			if(Character.isDigit(ch)) {
				int currentNum = 0;
				//when find one number, try to find more ahead
				while(i<exp.length() && Character.isDigit(exp.charAt(i))) {
					char chr = exp.charAt(i);
					currentNum = (currentNum*10) + (chr-'0');
					i++;
				}
				i--;
				numSt.push(currentNum);
			}
			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				//if stack top operator is having higher precendence then pop it and calculate result
				while(!charSt.isEmpty() && (precedence(charSt.peek())>= precedence(ch))) {
					int num1 = numSt.pop();
					int num2 = numSt.pop();
					int res = applyOp(charSt.pop(), num1, num2);
					numSt.push(res);
				}
				charSt.push(ch);
			}
			else {
				//invalid input
			    System.out.println("Invalid character found: " + ch);
			    System.exit(0); 
			}
		}
		// Final cleanup loop
		while (!charSt.isEmpty()) {
		    numSt.push(applyOp(charSt.pop(), numSt.pop(), numSt.pop()));
		}

		// Finally, the result is the only number left in numSt
		return numSt.pop();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		
		int result = evaluate(exp);
		System.out.println("Result: " + result);
		
	}

	

}
