import acm.program.ConsoleProgram;

//47. დაწერეთ პრედიკატ მეთოდი რომელსაც გადაეცემა სტრინგი და რომელიც დაადგენს არის თუ
//არა მოცემული ტექსტი პალინდრომი

public class Problem47 extends ConsoleProgram{
  public void run(){
  	String str =readLine("Enter the word: ");
	if(palindromeChecker(str)==true){
		println(str + " is a palindrome");
	}else{
		println(str + " is not a palindrome");
	}
  }

  private boolean palindromeChecker(String word){
	
	String leftHalf = word.substring(0, (word.length() / 2) - 1);
	String rightHalf = word.substring(word.length() / 2, word.length() - 1);
	if(word.length() % 2 == 1){
		leftHalf = word.substring(0, word.length() /2 );
		rightHalf = word.substring((word.length() / 2) + 2, word.length());
	}
	if(leftHalf.equals(rightHalf)){
		return true;
	}
	return false;
  }
}