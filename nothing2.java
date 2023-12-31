import java.util.Arrays;

import acm.program.ConsoleProgram;

public class nothing2 extends ConsoleProgram {
	public void run(){
		int[] dice = {2, 3, 6, 5, 4};
		if(checkForSmallStraight(dice)){
			println("True");
		}else{
			println("False");
		}
	}
	
	private boolean checkForSmallStraight(int[] dice) {
		Arrays.sort(dice); // Sort the dice values
	    int count = 1;
	    for (int i = 0; i < dice.length - 1; i++) {
	        if (dice[i] + 1 == dice[i + 1]) {
	            count++;
	            if (count == 4) { // Found a sequence of four consecutive numbers
	                return true;
	            }
	        }
//	        } else if (dice[i] != dice[i + 1]) {
//	            count = 1; // Reset the count if not consecutive or duplicate
//	        }
	    }
	    return false;
	}

	private boolean checkForLargeStraight(int[] dice) {
		int[] sequence1 = { 1, 2, 3, 4, 5 };
		int[] sequence2 = { 2, 3, 4, 5, 6 };
		Arrays.sort(dice);
		if (Arrays.equals(sequence1, dice) || Arrays.equals(sequence2, dice)) {
			return true;
		}
		return false;
	}
}
