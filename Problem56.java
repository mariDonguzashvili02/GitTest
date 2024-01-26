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
		for (int i = 0; i < numbers.length - 1; i++) {
	        for (int j = 0; j < numbers.length - 1 - i; j++) {
	            if (numbers[j] > numbers[j + 1]) {
	                int temp = numbers[j];
	                numbers[j] = numbers[j + 1];
	                numbers[j + 1] = temp;
	            }
	        }
	    }
		return numbers;
	}
	
}
