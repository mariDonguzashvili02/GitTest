import java.util.Arrays;

import acm.program.ConsoleProgram;

public class nothing extends ConsoleProgram {
	private int[] dice = { 2, 2, 3, 4, 5 };

	public void run() {

		if (checkCategory(dice, 1)) {
			int score = scoreCounter(dice, 1);
			println(score);
		}

	}

	private int scoreCounter(int[] dice, int category) {
		switch (category) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			return counterNumbers(dice, category);
		case 7:
			return upperScoreCounter();
		case 8:
			return upperBonusCounter();
		case 9:
		case 10:
			return sumOfAllDice(dice);
		case 11:
			return 25;
		case 12:
			return 30;
		case 13:
			return 40;
		case 14:
			return 50;
		case 15:
			return sumOfAllDice(dice);
		case 16:
			return lowerScoreCounter();
		case 17:
			return lowerScoreCounter() + upperScoreCounter();
		default:
			return 0;
		}
	}

	private int counterNumbers(int[] dice, int die) {
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == die) {
				sum += die;
			}
		}
		return sum;
	}

	private int upperScoreCounter() {
		int sum = 0;
		for (int i = 1; i < 7; i++) {
			int score = counterNumbers(dice, i);
			if (checkCategory(dice, i)) {
				sum += score;
			}

		}
		return sum;
	}

	private int upperBonusCounter() {
		if (upperScoreCounter() >= 63) {
			return 35;
		}
		return 0;
	}

	private int sumOfAllDice(int[] dice) {
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			sum += dice[i];
		}
		return sum;
	}

	private int lowerScoreCounter() {
		int sum = 0;
		for (int i = 9; i < 16; i++) {
			if ((i == 9 && checkCategory(dice, i)) || (i == 10 && checkCategory(dice, i))
					|| (i == 15 && checkCategory(dice, i))) {
				sum += sumOfAllDice(dice);
			}
			if (i == 11 && checkCategory(dice, i)) {
				sum += 25;
			}
			if (i == 12 && checkCategory(dice, i)) {
				sum += 30;
			}
			if (i == 13 && checkCategory(dice, i)) {
				sum += 40;
			}
			if (i == 14 && checkCategory(dice, i)) {
				sum += 50;
			}
		}
		return sum;
	}

	private boolean checkCategory(int[] dice, int category) {
		switch (category) {
		case 1:
			return (checkNumbers(1, dice));
		case 2:
			return (checkNumbers(2, dice));
		case 3:
			return (checkNumbers(3, dice));
		case 4:
			return (checkNumbers(4, dice));
		case 5:
			return (checkNumbers(5, dice));
		case 6:
			return (checkNumbers(6, dice));
		case 9:
			return (checkSameDice(3, dice));
		case 10:
			return (checkSameDice(4, dice));
		case 11:
			return (checkForFullHouse(dice));
		case 12:
			return (checkForSmallStreet(dice));
		case 13:
			return (checkForLargeStreet(dice));
		case 14:
			return (checkSameDice(5, dice));
		case 15:
			return true;

		default:
			return false;
		}
	}

	private boolean checkSameDice(int n, int[] dice) {
		for (int i = 0; i < dice.length; i++) {
			int element = dice[i];
			int count = 1;
			for (int j = i + 1; j < dice.length; j++) {
				if (dice[j] == element) {
					count++;
					if (count == n) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean checkForFullHouse(int[] dice) {

		for (int i = 0; i < dice.length; i++) {
			int element = dice[i];
			int count = 1;
			for (int j = 0; j < dice.length; j++) {
				if (dice[j] == element && i != j) {
					count++;
				}
			}
			if (count == 3) {
				int[] twos = elementRemover(dice, dice[i]);
				if (twos[0] == twos[1]) {
					return true;
				}
			}
		}

		return false;
	}

	private int[] elementRemover(int[] arr, int element) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		int n = 0;
		int[] newArray = new int[arr.length - count];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				newArray[n] = arr[i];
				n++;
			}
		}
		return newArray;
	}

	private boolean checkForSmallStreet(int[] dice) {
		int[] template = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int i = 0; i < dice.length; i++) {
			for (int j = 0; j < dice.length; j++) {
				if (dice[j] == template[i]) {
					count++;
					break;
				}
			}
		}
		if (count == 4) {
			return true;
		}
		return false;
	}

	private boolean checkForLargeStreet(int[] dice) {
		int[] sequence1 = { 1, 2, 3, 4, 5 };
		int[] sequence2 = { 2, 3, 4, 5, 6 };
		Arrays.sort(dice);
		if (Arrays.equals(sequence1, dice) || Arrays.equals(sequence2, dice)) {
			return true;
		}
		return false;
	}

	private boolean checkNumbers(int n, int[] dice) {
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == n) {
				return true;
			}
		}
		return false;
	}

}
