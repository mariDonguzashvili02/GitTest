import acm.program.ConsoleProgram;

//29. მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი.
public class Problem29 extends ConsoleProgram {
	public void run(){
//		int n = readInt("Please, enter Fibonacci numbers bound: ");
//		int f = -1;
//		int f1 = 1;
//		int f2 = 0;
//		
//		while(n > 0){
//			f = f1 + f2;
//			f2 = f1;
//			f1 = f;
//			println(f);
//			n--;
//		}
		while(true) {
			int n = readInt("enter n: ");
			
			int fibN = fib(n);
			println(fibN);
		}
	}
	
	private int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		int prev2 = 0;
		int prev1 = 1;
		
//		loop
		int curr = -1;
		for (int i = 2; i <= n; i++) {
			curr = prev2 + prev1;
			prev2 = prev1;
			prev1 = curr;
		}
		
		return curr;
	}
}
