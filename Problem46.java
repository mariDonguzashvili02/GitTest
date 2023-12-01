import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.

public class Problem46 extends ConsoleProgram{
  public void run(){
	
	String str = "fat";
	int one = 3;
	int two = 2; 
	println(symbolComparer(str));
	println(one / two);
	
  }

  private char symbolComparer(String text){
	int maxCharNum = 0;
	char frequentChar = 0;
	for(int i = 0; i < text.length(); i++){
		int currChar = symbolCounter(text, text.charAt(i));
		if(currChar > maxCharNum){
			maxCharNum = currChar;
			frequentChar = text.charAt(i);
		}
	}
	
	return frequentChar;
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