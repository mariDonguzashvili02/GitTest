import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//41. გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.
public class Problem41 extends GraphicsProgram {
	public void run() {
		
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e) {
		GOval circle = new GOval(20, 20);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle, e.getX(), e.getY());

	}
}
