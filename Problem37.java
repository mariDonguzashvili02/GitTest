import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//37. რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//დადებულმა რიცხვმა
public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MAX_VALUE = 36;
	private staic final int MIN_VALUE = 0;
	public void run() {
		int betNumber = readBetNumber();
		int rouletteResult = spinRoulette();
		if (betNumber == rouletteResult) {
			println("You Won!");

		} else {
			println("You Lost!");
		}
	}

	private int spinRoulette() {
		int rouletteResult = rgen.nextInt(MIN_VALUE , MAX_VALUE);
	}

	private int readBetNumber() {
		while (true) {
			int betNum = readInt("Enter number from"+ MIN_VALUE +" to" + MAX_VALUE + ": ");
			
			if (betNum < MIN_VALUE || betNum > MAX_VALUE) {
				betNum = readInt("Enter number from 0 to 36: ");
			}else{
				return betNum;
			}
		}

	}

}
