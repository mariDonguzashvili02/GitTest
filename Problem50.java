import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით.

public class Problem50 extends ConsoleProgram{
	public void run(){
		String text = readLine("Write text: ");
		println(wordCounter(text));
	}
	
	private int wordCounter(String text){
		StringTokenizer tokenizer = new StringTokenizer(text);
		int count = 0;
		while(tokenizer.hasMoreTokens()){
			tokenizer.nextToken();
			count++;
		}
		return count;
	}

}