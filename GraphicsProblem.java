import acm.program.GraphicsProgram;
import acm.graphics.GLine;
import acm.graphics.GRect;

public class GraphicsProblem extends GraphicsProgram {
	private static final int WIDTH = 100;
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 00;
	private static final double WINDOW_WIDTH = 40;
	private static final double WINDOW_HEIGHT = 60;
	private static final double ROOF_HEIGHT = 40;

	public void run() {
		drawMidLine();
		drawHouse();
	}

	private void drawHouse() {
		drawWall();
		drawWindows();
		 drawRoof();
		 /*  drawDoor();
		 */
	}

	private void drawRoof() {
		
		double x1 = getWidth()/2 -HOUSE_WIDTH / 2;
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = getWidth();
		double y2 = y1;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}

	private void drawWindows() {
		for (int i = 0; i < 2; i++) {
			double x;
			int y = (int) ((getHeight() - HOUSE_HEIGHT) + WINDOW_HEIGHT / 2);
			if (i == 0) {
				x = getWidth() / 2 - HOUSE_WIDTH / 2 + WINDOW_WIDTH / 2;
			} else {
				x = getWidth() / 2 + HOUSE_WIDTH / 2 - WINDOW_WIDTH * 3 / 2;
			}
			GRect window = new GRect(WINDOW_WIDTH, WINDOW_HEIGHT);
			add(window, x, y);
		}
	}

	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		double x = getWidth() / 2 - HOUSE_WIDTH /2;
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
	}

	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
}
// int width = 100;
// width = width +20;
// width = 200;
//
// GRect rect = new GRect(WIDTH, width);
// add(rect);
// if(true){
// width = 5;
// int height = 30;
// }
// int height = 4;