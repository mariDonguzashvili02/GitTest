import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;
//62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
//სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.

public class Problem62 extends ConsoleProgram{
	private static String SPECIAL_SYMBOL = "";
	HashMap<String, Integer> statistics = new HashMap<String, Integer>();

	public void run(){
		ArrayList<String> names = new ArrayList<String>();
		String name = nameDisplayer();
		names.add(name);
		while(true){
			name = readLine("?");
			if(name == SPECIAL_SYMBOL){
				break;
			}
			names.add(name);
		}
		
		nameCounter(names);
		names = uniqueNames(names);
		for(int i = 0; i < statistics.size(); i++){
			println(statistics.get(names.get(i)));
		}
		
		
	}
	
	
	private ArrayList<String> uniqueNames(ArrayList<String> names){
		for(int i = 0; i < names.size(); i++){
			for(int j = i + 1; j < names.size(); i++){
				if(names.get(i) == names.get(j)){
					
					names.remove(j);
				}
			}
		}
		return names;
	}
	
	private void nameCounter(ArrayList<String> names){
		for(int i = 0; i < names.size(); i++){
			for(int j = i + 1; j < names.size(); i++){
				if(names.get(i) == names.get(j)){
					int count = 0;
					count++;
					statistics.put(names.get(i), count);
					names.remove(j);
				}
			}
		}
		
	}
	
	
	
	private String nameDisplayer() {
		String m = readLine("?");
		while (m == SPECIAL_SYMBOL) {
			println("You need to enter the number first, not special symbol!");
			m = readLine("?");
		}
		return m;
	}
}
