import acm.program.ConsoleProgram;

public class nothing extends ConsoleProgram {
	public void run(){
		int[] dice = {2, 2, 3, 4, 6};
		if(checkForStreets(dice)){
			println("true");
		}else{
			println("false");
		}
	}
	
	private boolean checkForStreets(int[] dice){
		int[] template = {1, 2, 3, 4, 5};
		int count = 0;
		for(int i = 0; i < dice.length; i++){
			for(int j = 0; j < dice.length; i++){
				if(dice[j] == template[i]){
					count++;
					break;
				}
			}
		}
		if(count == 4 || count == 5){
			return true;
		}
		return false;
	}
}
