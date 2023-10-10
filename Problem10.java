import stanford.karel.Karel;

//10. კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class Problem10 extends Karel {
	public void run() {
		substractBeepers();

	}

	private void turnAround() {
		turnLeft();
		turnLeft();
	}

	private void substractBeepers() {
		move();
		move();
		while (beepersPresent()) {
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
	private void calculatingDevision(){
		
	}
}
