import acm.program.ConsoleProgram;
//18. კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათ შორის მაქსიმალური.
public class Problem18 extends ConsoleProgram {
	
	public void run(){
		
		int firstNum = readInt ("Enter the first number: ");
		int secondNum = readInt ("Enter the second number: ");
		
		if(firstNum > secondNum){
			println("The max is " + firstNum);
		}else{
			println("The max is "+ secondNum);
		}
	}
}
