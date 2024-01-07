package MidtermPractice;

import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MathString extends ConsoleProgram {
	public void run() {

	}

	private int calculator(String operation) {
		StringTokenizer tokenizer = new StringTokenizer(operation);
		int num1 = 0;
		int num2 = 0;
		int tokens = numberCounter(operation);
		for(int i = 0; i < tokens; i++){
			String token = tokenizer.nextToken();
			if(Character.isDigit(token.charAt(0))){
				int num = stringToInt(token);
				num1 = num;
			}
			String token1 = tokenizer.nextToken();
			if(!Character.isDigit(token1.charAt(0)) && token1.charAt(0) == '+'){
				
			}
		}

	}

	private int stringToInt(String num) {
		int n = 0;

		for (int i = 0; i < num.length(); i++) {
			int c = charToInt(num.charAt(i));
			n = n * 10 + c;

		}
		return n;

	}

	private int charToInt(char c) {
		return c - '0';
	}

	private int wordCounter(String text) {
		StringTokenizer tokenizer = new StringTokenizer(text);
		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			count++;
		}
		return count;
	}

	private int numberCounter(String operation) {
		StringTokenizer tokenizer = new StringTokenizer(operation);
		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (Character.isDigit(token.charAt(0))) {
				count++;
			}
		}
		return count;

	}

}
