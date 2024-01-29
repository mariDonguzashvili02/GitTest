import acm.program.ConsoleProgram;
//61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
//შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.

public class Problem61 extends ConsoleProgram{
	public void run(){
		int m = readInt("Enter the number m: ");
		int n = readInt("Enter the number n: ");
		int[] numbers = new int[n];
		
		for(int i = 0 ; i < n ; i++){
			int number = readInt("Enter the numbers: ");
			numbers[i] = number;
		}
		
		for(int i = 0 ; i < n ; i++ ){
			for(int j = i + 1; j < n; j++ ){
				if(numbers[i] + numbers[j] == m){
					println(numbers[i]);
					println(numbers[j]);
					break;
				}
			}
		}
	}
}
