
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram {
	public void run() {

		double x1 = 0;
		double y1 = 10;
		double x2 = 100;
		double y2 = 110;

		for (int i = 0; i < 10; i++) {

			x1 += 10;
		

			GLine verticalLine = new GLine(x1, y1, x1, y2);
			add(verticalLine);

		}
		x1 = 10;
		x2 = 110;
		y1 = 0;
		y2 = 100;
				
		for(int i = 0; i < 10; i++){
			y1 += 10;
			GLine horizontalLine = new GLine(x1, y1, x2, y1);
			add(horizontalLine);
		}

	}

}
