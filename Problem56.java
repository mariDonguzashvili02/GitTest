import acm.program.ConsoleProgram;
//56. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, დაალაგეთ რიცხვები
//ზრდადობით და დაბეჭდეთ.

public class Problem56 extends ConsoleProgram{
	public void run(){
		int n = readInt("Please enter number of numbers: ");
		int[] numbers = new int[n];
		for(int i = 0; i < n ; i++){
			int m = readInt("Enter number: ");
			numbers[i] = m;
		}
		
		int[] sorted = sorter(numbers);
		
		for(int i = 0; i < numbers.length; i++){
			println(sorted[i]);
		}
	}
	
	private int[] sorter(int[] numbers){
		int[] sorted = new int[numbers.length];
		int j = 0;
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i - 1] < numbers[i]){
				sorted[j] = numbers[i - 1];
				j++;
			}
			
		}
		return sorted;
	}
	
}
