import acm.program.ConsoleProgram;
//58. (2018 წლის გამოცდის ამოცანა)
//მატრიცას ეწოდება მაგიური თუკი ის კვადრატულია(n x n-ზე) და მასში არის ყველა
//რიცხვი 1-დან n^2-ის ჩათვლით. თქვენი მიზანია დაწეროთ magicMatrix მეთოდი
//რომელიც შეამოწმებს არის თუ არა მატრიცა მაგიური და თუკი მაგიურია მაშინ
//დააბრუნებს true-ს თუ არა მაშინ false-ს.

public class Problem58 extends ConsoleProgram{
	public void run(){
		int[][] test = {
				{1, 2, 3},
				{5, 6, 7},
				{8, 9, 4}};
		
		if(magicMatrix(test)){
			println("true");
		}else{
			println("flase");
		}
	}
	
	private boolean magicMatrix(int[][] matrix){
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		if(rows != columns){
			return false;
		}
		
		for(int i = 1; i < rows*columns; i++){
			if(!containsNumber(matrix, i)){
				return false;
			}
		}
		
		return true;
	}
	
	private boolean containsNumber(int[][] matrix, int n){
		for(int j = 0; j < matrix.length; j++){
			for(int i = 0; i < matrix[0].length; i++){
				if(matrix[j][i] == n){
					return true;
				}
			}
		}
		return false;
	}
	
}
