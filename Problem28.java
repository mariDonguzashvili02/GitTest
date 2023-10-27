import acm.program.ConsoleProgram;

//28. მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ
//რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა.
public class Problem28 extends ConsoleProgram {
	public void run() {

		int n = readInt("Enter the number: ");
		
		println(CountSum(n));
	}
	
	private int CountSum(int n){
		
		int sum = 0;
		for(int i = 0; i < n + 1; i++){
			int m = readInt("Enter the number again until you reach -1:");
			if(m % 2 == 0){
				sum += m ;
			}
		}
		
		return sum;
	}

}
