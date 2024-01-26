import acm.program.ConsoleProgram;
//55. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, გაარკვიეთ შეყვანილი რიცხვები
//არის თუ არა ზრდადობით დალაგებული. თუკი არის დაბეჭდეთ “sorted” თუ არა მაშინ
//დაბეჭდეთ “not sorted”.

public class Problem55 extends ConsoleProgram{
	public void run(){
		int n = readInt("Please enter number of numbers: ");
		int[] numbers = new int[n];
		for(int i = 0; i < n ; i++){
			int m = readInt("Enter number: ");
			numbers[i] = m;
		}
		
		if(isSorted(numbers)){
			println("sorted");
		}else{
			println("not sorted");
		}
		
	}
	
	private boolean isSorted(int[] numbers){
		int count = 0;
		
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i - 1] < numbers[i]){
				count++;
			}
		}
		
		if(count == numbers.length - 1){
			return true;
		}
		return false;
	}
}
