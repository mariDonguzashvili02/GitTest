import acm.program.ConsoleProgram;

//27. მომხმარებელს შეყავს n და m დაბეჭდეთ n^m
public class Problem27 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter the number n: ");
		int m = readInt("Enter the number m : ");
		println(power(n,m));
		
	}
	private int power(int n, int m){
		for( int i = 0 ; i < m ; i++){
			n = n*n;
		}
		return n;
		
	}
}
