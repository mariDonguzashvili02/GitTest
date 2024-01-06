//53. დაწერეთ პროგრამა რომელიც ფაილიდან წაიკითხავს ტექტს და დათვლის შემდეგ
//სტატისტიკებს: სიმბოლოების რაოდენობა, სიტყვების რაოდენობა(სიტყვები სფეისებით
//გამოყოფილია ერთმანეთისგან), წინადადებების რაოდენობა. რამდენი წინდადება მთავრდება
//წერტილით, კითხვის ნიშნით და ძახილის ნიშნით?

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram{
	public void run(){
		try{
			BufferedReader rd = new BufferedReader(new FileReader("C:/Users/maria/Downloads/Midterm2022Session1Garbage.java"));
			String text = "";
			while(true){
				String line = rd.readLine();
				if(line == null){
					break;
				}
				text += line + "\n";
			}
			rd.close();
			symbolCounter(text);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			println("File not found");
		}catch(IOException e){
			e.printStackTrace();
			println("Other issues found");
		}
	}
	
	private void symbolCounter(String text){
		int symbols = 0;
		int words = 0;
		int sentences = 0;
		int period = 0;
		int exclamationMark = 0;
		int questionMark = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(text, " .?!\n", true);
		
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			
			if(!token.equals(" ") && !token.equals("\n")){
				words++;
				symbols += token.length();
			}else if(token.equals("!")){
				exclamationMark++;
				sentences++;
			}else if(token.equals("?")){
				questionMark++;
				sentences++;
			}else if(token.equals(".")){
				period++;
				sentences++;
			}
		}
		
		println("Symbols: " + symbols);
		println("Words: " + words);
		println("Sentences: " + sentences);
		println("Periods: " + period);
		println("Excalmation Marks: " + exclamationMark);
		println("Question Marks: " + questionMark);
	}

}
