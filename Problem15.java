import acm.program.ConsoleProgram;
//15. კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო არითმეტიკული.
public class Problem15 extends ConsoleProgram{

	public void run(){
		
		int firstNum = readInt ("Enter the first number:" );
		int secondNum = readInt ("Enter the first number:");
		
		double avg = (firstNum+secondNum)/ (double) 2;
		println(avg);
	}
}
