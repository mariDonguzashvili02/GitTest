package MidtermPractice;

import acm.program.ConsoleProgram;

//სტრინგი ბალანსირებულია თუკი მასში მხოლოდ ‘L' და ‘R’ სიმბოლოება და 
//მთაი რაოდენობა ერთნაირია. დაწერეთ მეთოდი რომელსაც გადაეცემა 
//ბალანსირებული სტრინგი და რომელიც აბრუნებს მაქსიმუმ რამდენ 
//ბალანსირებულ სტრინგად დაჭრა შეიძლება ამ სტრინგის. გაითვალისწინეთ, 
//რომ დაჭრის შედეგად მიღებული თითოეული სტრინგი ბალანსირებული უნდა იყოს. 
//ასევე გაითვალისწინეთ, რომ დაჭრილი სტრინგების შეწებებით თავდაპირველი სტრინგი 
//უნდა მიიღებოდეს.
//თქვენმა მეთოდმა უნდა დააბრუნოს ნაჭრების რაოდენობა.
//მაგალითად სტრინგი “LLLLRRRR” უფრო პატარა ბალანსირებულ ნაჭრებად ვერ დაიყოფა შესაბამისად თქვენმა მეთოდმა უნდა დააბრუნოს 1. 
//სტრინგი “LRLLRLRRRL” შეიძლება დაიჭრას ასე “LR”-“LLRLRR”-“RL”. უფრო მეტ დაბალანსებულ ნაჭრებად ვერ დაიჭრება შესაბამისად მეთოდმა უნდა დააბრუნოს 3.
//ხოლო სტრინგი “LRLRRL” შეიძლება დაიჭრას ასე “LR”-“LR” -”RL”. ანუ მეთოდმა უნდა დააბრუნოს 3.
//
//მეთოდი :
//private int balance(String text) დაწერეთ balance.java ფაილში
//public void run(){
//  int n = balance(“LLLRRR”);
//  println(n); // უნდა დაბეჭდოს 1
//}
//

public class String_balance extends ConsoleProgram{
	public void run(){
		String str = "LRLLRLRRRL";
		println(balance(str));
	}
	
	private int balance(String text){
	
		int Lcount = 0;
		int Rcount = 0;
		int result = 0;
		for(int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			if(c == 'L'){
				Lcount++;
			}else{
				Rcount++;
			}
			if(Lcount == Rcount){
				result++;
			}
		}
		return result;
		
	}
	
	
}
