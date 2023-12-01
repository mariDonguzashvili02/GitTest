import acm.program.ConsoleProgram;

//48. კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება

public class Problem48 extends ConsoleProgram{
	public void run(){
		String str = "string";
		symbolStatistics(str);
	}
	private void symbolStatistics(String text){
		for(int i = 0; i < text.length(); i++){
			println("Symbol " + text.charAt(i) + " occurs " + symbolCounter(text, text.charAt(i)) + " times");
		}
	}
	
	private int symbolCounter(String text, char c){
		int count = 0; 
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == c){
				count++;
			}
		}
		return count;
	}
}