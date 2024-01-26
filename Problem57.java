import java.util.Arrays;

import acm.program.ConsoleProgram;
//57. დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის
//სტრინგი ერთმანეთის ანაგრამაა, ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. ჩათვალეთ,
//რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება.
//იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით: თითოეული
//სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში.
//შემდეგ შეადარეთ ერთმანეთს მასივები.

public class Problem57 extends ConsoleProgram{
	public void run(){
		String first = readLine("Enter first word: ");
		String second = readLine("Enter second word: ");
		if(isAnagram(first, second)){
			println("Is anagram!");
		}else{
			println("Is not anagram!");
		}
	}
	
	private boolean isAnagram(String first, String second){
		int[] countFirst = symbolCounter(first);
		int[] countSecond = symbolCounter(second);
		return Arrays.equals(countFirst, countSecond);
	}
	
	private int[] symbolCounter(String word){
		int[] symbolCount = new int[26]; 

        for (char symbol : word.toCharArray()) {
            if (symbol >= 'a' && symbol <= 'z') {
                symbolCount[symbol - 'a']++;
            }
        }

        return symbolCount;
	}
}
