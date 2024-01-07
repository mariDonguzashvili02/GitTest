package MidtermPractice;

import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ScoreCounter extends GraphicsProgram {
	private static final int BOXSIZE = 200;
	private GRect box;
	private GLabel scoreDisplay;
	private boolean inProgress = false;
	private double lastY;
	private double lastX;
	private int SCORE;

	public void run() {
		rectCreator();
		displayPoints();
		addMouseListeners();

	}

	public void mouseDragged(MouseEvent e) {
		double mouseX = e.getX();
		if (lastX != -1 && lastY != -1 && inProgress) {
			if (mouseX > lastX) {
				addScore();
			}
			if (mouseX < lastX) {
				minusScore();
			}
			inProgress = false;
		}

	}

	public void mousePressed(MouseEvent e) {
		double leftX = box.getX();
		double rightX = box.getX() + box.getWidth();
		double topY = box.getY();
		double bottomY = box.getY() + box.getHeight();
		double mouseX = e.getX();
		double mouseY = e.getY();
		if (mouseX >= leftX && mouseX <= rightX && mouseY <= bottomY && mouseY >= topY) {
			lastX = e.getX();
			lastY = e.getY();
			inProgress = true;
		} else {
			lastY = -1;
			lastX = -1;

		}

	}

	public void rectCreator() {
		box = new GRect(BOXSIZE, BOXSIZE);
		double x = (getWidth() - BOXSIZE) / 2;
		double y = (getHeight() - BOXSIZE) / 2;
		add(box, x, y);
	}

	public void displayPoints() {
		
		String points = "0";
		scoreDisplay = new GLabel(points);

		double x = getWidth() / 2;
		double y = getHeight() / 2;
		add(scoreDisplay, x, y);
	}

	private void minusScore() {
		if (SCORE > 0) {
			SCORE--;
			scoreDisplay.setLabel("" + SCORE);
		}

	}

	private void addScore() {
		if (SCORE < 9) {
			SCORE++;
			scoreDisplay.setLabel("" + SCORE);
		}

	}

}
