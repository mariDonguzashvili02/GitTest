import acm.program.ConsoleProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო

public class Problme45 extends ConsoleProgram{
   public void run(){

	String str = "Hello";
	println(symbolCounter(str, 'l'));

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
