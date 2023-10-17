import acm.program.ConsoleProgram;
//17. კონსოლიდან წაიკითხეთ ნამდვილი რიცხვი და დაბეჭდეთ მისი მთელი ნაწილი და მისი
//წილადი ნაწილი. მაგალითად მომხმარებელმა თუ შეიყვანა 3.14 თქვენმა პროგრამამ უნდა
//დაბეჭდოს 3 და 0.14
public class Problem17 extends ConsoleProgram{

	public void run(){
		
		double number = readDouble ("Enter the number: ");
		int wholeNum = (int)number;
		double substraction = number - wholeNum;
		println(substraction);
		
	}
}
