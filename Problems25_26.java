import acm.program.ConsoleProgram;
//25. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უმცირესი საერთო ჯერადი.
//26. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უდიდესი საერთო გამყოფი
public class Problems25_26 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n:");
		while(n<=0){
			println("Enter positive number!");
		    n = readInt("Enter n:");
		}
		int m = readInt("Enter m:");
		while(m<=0){
			println("Enter positive number!");
		    m = readInt("Enter m:");
		}
		int gcd = gcd(n, m);
		println("GCD is : " + gcd);
		
		int lcm = lcm(n, m);
		println("LCM is: " + lcm);
	}

	private int lcm(int n, int m) {
		return  n * m / gcd(n, m);
	}

	private int gcd(int n, int m) {
		int minNum = Math.min(n, m);
		for (int i = minNum; i >= 1 ; i--){
			if(n % i == 0 && m % i == 0){
				return i;
			}
		}
		
		return -1;
	}
}
