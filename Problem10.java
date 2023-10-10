import stanford.karel.Karel;

//10. კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class Problem10 extends Karel {
	public void run() {
		move();
		move();
		while (beepersPresent()) {
			substractBeepers();
			turnLeft();
			move();
			while (beepersPresent()) {
				puttingBackDevisor();
			}
		}

	}

	private void turnAround() {
		turnLeft();
		turnLeft();
	}

	private void substractBeepers() {

		while (beepersPresent()) {

			doublingTheDevisor();
			pickBeeper();
			turnAround();
			move();
			move();
			turnAround();
			putBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
			turnAround();
			putBeeper();
			move();
			move();

		}

	}

	private void calculatingDevision() {

	}

	private void doublingTheDevisor() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();

	}

	private void puttingBackDevisor() {

		pickBeeper();
		turnAround();
		putBeeper();
		turnAround();
		move();
	}
}
