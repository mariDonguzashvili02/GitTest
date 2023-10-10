import stanford.karel.Karel;
//8. კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
public class Problem08 extends Karel {
	public void run(){
		move();
		move();
		while(beepersPresent()){
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
		turnAround();
		move();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
			
		}
	}
	private void turnAround(){
		turnLeft();
		turnLeft();
		
	}
}
