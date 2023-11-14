import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
//43. წრეწირის drag ით გადაადგილება
public class Problem43 extends GraphicsProgram {
	private GOval circle;
	private static final int RADIUS = 50;
	private static double prevX;
	private static double prevY;
	public void run(){
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - RADIUS, getWidth() / 2 - RADIUS);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e ){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e ){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			obj.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		}
	}

}
