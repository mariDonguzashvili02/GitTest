import acm.program.ConsoleProgram;
//54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.

public class Problem54 extends ConsoleProgram{
	public void run(){
		int n = readInt("Please enter number of numbers: ");
		int[] numbers = new int[n];
		for(int i = 0; i < n ; i++){
			int m = readInt("Enter number: ");
			numbers[i] = m;
		}
		int[] filtered = elementDeleter(numbers, findMax(numbers));
		println("Max numbers are: " + findMax(numbers) + " , " + findMax(filtered));
		
		
	}
	
	private int findMax(int[] numbers){
		int max = numbers[0];
		int i = 1;
		while (i < numbers.length)
		{
		    if (numbers[i] > max)
		    {
		        max = numbers[i];
		    }
		    i++;
		}
		return max;
	}
	
	private int[] elementDeleter(int[] array, int n){
		int[] filtered = new int[array.length - 1];
		int j = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] != n){
				filtered[j] = array[i];
			}
		}
		return filtered;
	}
}
