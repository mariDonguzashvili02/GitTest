import acm.program.ConsoleProgram;
//16. კონსოლიდან წაიკითხეთ სამი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო ჰარმონიული.
//შეგახსენებთ, რომ სამი რიცხვის საშუალო ჰარმონიულის გამოთვლის ფორმულა არის (1/(1/a + 1/b +1/c))
public class Problem16 extends ConsoleProgram{

	public void run(){
		
		int a = readInt("Enter the first number");
		int b = readInt ("Enter the second number");
		int c = readInt ("Enter the third number");
		
		int harm = 1/(1/a + 1/b + 1/c);
		println(harm);
	}
}
