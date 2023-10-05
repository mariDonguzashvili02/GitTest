import stanford.karel.Karel;
//9. კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class Problem09 extends Karel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			while(beepersPresent()){
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
				pickBeeper();
				turnLeft();
				move();
				putBeeper();
				turnAround();
				turnLeft();
				
			}
			
		}
	}
	

	private void turnAround(){
		turnLeft();
		turnLeft();
		
	}
}
