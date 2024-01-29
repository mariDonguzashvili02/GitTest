import acm.program.ConsoleProgram;
//59. (2018 წლის გამოცდის ამოცანა)
//გადმოგეცემათ nxm-ზე მატრიცა რომელშიც მხოლოდ 0-ები და 1-ები წერია. მეთოდმა
//უნდა დააბრუნოს ამ მატრიცის ყველაზე დიდი ქვემართკუთხედის
//ზომა(ელემენტების რაოდენობა) რომელიც მხოლოდ 1-ებისგან შედგება.
//მაგალითად:
//01100100
//01111100
//00111100
//00111100
//ამ მატრიცაში ყველაზე დიდი შიდა მართკუთხედი, რომელიც სულ ერთიანებისგან
//შედგება არის 12 ზომის:
//01100100
//01111100
//00111100
//00111100
//შესაბამისად ამ მატრიცაზე მეთოდმა უნდა დააბრუნოს 12. ჩათვალეთ რომ
//გადმოცემულ მატრიცაში ერთი უჯრა მაინც იქნება რომელშიც წერია 1.

public class Problem59 extends ConsoleProgram{
	public void run(){
		
	}
	
	private void rectDetector(int[][] matrix){
		int area = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 1){
					
				}
			}
		}
		
	}
	
	private void getMaxArea(int[][] matrix, int x, int y){
		int maxArea = 0;
		for(int i = x; i < getMaxLength(matrix, x, y); i++){
			for(int j = y; j < getMaxHeight(matrix, x, y); j++){
				if()
				
			}
		}
				
				
	}
	
	private int getMaxHeight(int[][] matrix, int x, int y){
		int height = 0; 
		int[] column = getColumnArray(matrix, y);
		for(int i = x; i < column.length; i++){
			if(column[i] == 1){
				height++;
			}else{
				break;
			}
		}
		return height;
		
	}
	
	private int getMaxLength(int[][] matrix, int x, int y){
		int length = 0;
		int[] row = matrix[x];
		for(int i = y; i < row.length; i++ ){
			if(row[i] == 1){
				length++;
			}else{
				break;
			}
		}
		return length;
	}
	
	private int[] getColumnArray(int[][] matrix, int n){
		int[] colArray = new int[matrix[0].length];
		
		for(int row = 0; row < matrix.length; row++) {
		    colArray[row] = matrix[row][n];
		}
		return colArray;
	}
}
