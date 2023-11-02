import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//33. დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს,
//რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან.
//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული
//წრე, შემთხვევით კოორდინატებზე.
public class Problem34 extends GraphicsProgram {
	private static final int MIN_RADIUS = 10;
	private static final int MAX_RADIUS = 30;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		// RandomGenerator rgen = RandomGenerator.getInstance();
		// Math.max(3,5);
		// GRect myRect = new GRect(10,20);
		// myRect.setFilled(true);
		// int a = rgen.nextInt(6);

		addRandomCircle();
	}

	private void addRandomCircle(){
			int radius = rgen.nextInt(MIN_RADIUS,MAX_RADIUS);
			double x = rgen.nextDouble(0, getWidth() - 2 * radius);
			double y = rgen.nextDouble(0, getHeight() - 2 * radius);
			Color color = rgen.nextColor();
			
			GOval circle = new GOval(2 * radius, 2 * radius);
			circle.setFilled(true);
			circle.setColor(color);
			add(circle, x, y);
		}

}
