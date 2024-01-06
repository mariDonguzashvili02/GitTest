import acm.program.ConsoleProgram;

//29. მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი.
public class Problem29 extends ConsoleProgram {
	public void run(){
		int n = readInt("Please, enter Fibonacci numbers bound: ");
		int f = -1;
		int f1 = 1;
		int f2 = f + f1;
		
		while(n > 0){
			f = f1;
			f1 = f2;
			f2 = f + f1;
			println(f2);
			n--;
		}
		
	}
}
