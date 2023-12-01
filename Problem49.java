import acm.program.ConsoleProgram;

//49. დაწერეთ stringToInteger მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს მთელ რიცხვს.
//ჩათვალეთ, რომ გადაცემული სტრინგი მხოლოდ ციფრებისგან შედგება და არ იწყება 0-ით.
//მაგალითად “234” გადაცემის შემთხვევაში მეთოდმა უნდა დააბრუნოს 234. ასევე ჩათვალეთ,
//რომ დაბრუნებული მნიშვნელობა დადებითია და ეტევა int-შ//ი.

public class Problem49 extends ConsoleProgram{
	public void run(){
		String number = "234";
		println(stringToInteger(number));
	}
	
	private int stringToInteger(String num){
		int n = 0;
		for(int i = 0; i < num.length(); i++){
			int c = charToInt(num.charAt(i));
			n = n * 10 + c;
		}
		return n;
	}
	
	private int charToInt(char c){
		return c - '0';
	}
}