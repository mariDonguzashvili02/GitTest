import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
//39. დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა
//წერტილიდან მარჯვენა კედლამდე.
public class Probelm39 extends GraphicsProgram {
	private static final int radius = 50;
	private static final int PAUSE_MS = 20;
	private static final int VEL_X = 3;
	public void run(){
		
		
		GOval circle = new GOval(radius, radius);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		double x = 0;
		double y = getWidth()/ 2;
		add(circle, x, y);
		double finalX = getWidth();
		
		while(circle.getX() <= finalX){
			circle.move(VEL_X, 0);
			pause(PAUSE_MS);
		}
		
	}

}
