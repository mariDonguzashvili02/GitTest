package MidtermPractice;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class BallProblem extends GraphicsProgram {
	private GOval ball;
	private static final int RADIUS = 50;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		ballInit();
		ballMover();
		addMouseListeners();
	}
	private void ballInit(){
		ball = new GOval(RADIUS * 2, RADIUS * 2);
		ball.setFilled(true);
		Color color = rgen.nextColor();
		ball.setColor(color);
		double x = getWidth() / 2 - RADIUS;
		double y = getHeight() / 2;
		add(ball, x, y);
		
	}

	private void ballMover(){
		double finalY = getHeight() - RADIUS * 2;
		double v = 8;
		while(true){
			if(ball.getY() <= 0){
				v=-v;
			}
			if(ball.getY() >= finalY){
				v=-v;
			}
			ball.move(0, v);
			pause(20);
		}
	}

	public void mousePressed(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			
			ball.move(0,0);
			Color colour = rgen.nextColor();
			ball.setColor(colour);
		}
		
	}

	public void mouseReleased(MouseEvent e){
		Color color2 = rgen.nextColor();
		ball.setColor(color2);
		ballMover();
	}	
}
