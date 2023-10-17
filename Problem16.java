import acm.program.ConsoleProgram;
//16. კონსოლიდან წაიკითხეთ სამი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო ჰარმონიული.
//შეგახსენებთ, რომ სამი რიცხვის საშუალო ჰარმონიულის გამოთვლის ფორმულა არის (1/(1/a + 1/b +1/c))
public class Problem16 extends ConsoleProgram{

	public void run(){
		
		double a = readInt("Enter the first number: ");
		double b = readInt ("Enter the second number: ");
		double c = readInt ("Enter the third number: ");
		
		double harm = 1/(1/a + 1/b + 1/c);
		println(harm);
	}
}
