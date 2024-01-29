import java.util.ArrayList;

import acm.program.ConsoleProgram;
//60. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.

public class Problem60 extends ConsoleProgram{
	private static final int SPECIAL_SYMBOL = -1;
	public void run(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int number = numberDisplayer();
		numbers.add(number);
		while(true){
			number = readInt("?");
			if(number == SPECIAL_SYMBOL){
				break;
			}
			numbers.add(number);
		}
		for(int i = numbers.size() - 1; i >= 0 ; i--){
			println(numbers.get(i));
		}
		
		
	}
	
	private int numberDisplayer() {
		int m = readInt("?");
		while (m == SPECIAL_SYMBOL) {
			println("You need to enter the number first, not special symbol!");
			m = readInt("?");
		}
		return m;
	}
}
