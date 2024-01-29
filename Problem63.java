import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
//63. კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
//ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
//მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
//B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.

public class Problem63 extends ConsoleProgram{
	private static String SENTINEL = "";

	public void run(){
		HashMap<String, Integer> friends = new HashMap<String, Integer>();
		while(true){
			String text = readLine("Enter friends: ");
			if(text.equals(SENTINEL)){
				break;
			}
			
			StringTokenizer tokenizer = new StringTokenizer(text, " and ");
			String friend1 = tokenizer.nextToken();
			if(!friends.containsKey(friend1)){
				friends.put(friend1, 0);
			}
			
			int newCount = friends.get(friend1) + 1;
			friends.put(friend1, newCount);
			
		}
		
		println(friends);
		

	}
	
	
}
