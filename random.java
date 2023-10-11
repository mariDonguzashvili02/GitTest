import stanford.karel.SuperKarel;

public class random extends SuperKarel {
	public void run() {
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		turnRight();
		while (frontIsClear()) {
			move();
			turnLeft();
			if (frontIsClear()) {
				move();
				move();
			}

			turnRight();
		}
	}

}
