import acm.program.ConsoleProgram;
//20. კონსოლიდან წაიკითხეთ n, შემდეგ წაიკითხეთ n ცალი მთელი რიცხვი და დაბეჭდეთ ჯამი
public class Problem20 extends ConsoleProgram{

	public void run(){
		int number = readInt("Enter the number: ");
		int sum = 0;
		while (number > 0){
			sum += number;
		}
		println(sum);
	}
}
