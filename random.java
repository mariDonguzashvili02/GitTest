import stanford.karel.SuperKarel;

public class random extends SuperKarel {
	public void run(){
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		while(frontIsClear()){
			move();
		}
		turnRight();
		while(frontIsClear()){
			move();
			turnRight();
			move();
			move();
			turnLeft();
		}
	}

}
