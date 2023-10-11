import stanford.karel.SuperKarel;

public class random extends SuperKarel {
	public void run(){
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		turnRight();
		while(frontIsClear()){
			move();
			turnLeft();
			move();
			move();
			turnRight();
		}
	}

}
