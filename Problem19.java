import acm.program.ConsoleProgram;
//19. კონსოლიდან წაიკითხეთ მთელი რიცხვი n და შემდეგ n ჯერ დაბეჭდეთ “hello ” + i, სადაც i
//იცვლება 0 დან n-1 მდე.
public class Problem19 extends ConsoleProgram {

	public void run(){
		
		int n = readInt("Enter the whole number: ");
		int i = n-1;
		for(int x = 0; x<n; n--){
			println("hello" + i);
		}
	}
}
