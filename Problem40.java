import java.awt.Color;

import acm.graphics.GOval;

//40. წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.
public class Problem40 extends GraphicsProblem {
	private static final int radius = 50;
	private static final int PAUSE_MS = 20;
	private static final int VEL_X = 8;

	public void run() {

		GOval circle = new GOval(radius, radius);
		circle.setFilled(true);
		circle.setColor(Color.PINK);
		double x = 0;
		double y = getHeight() / 2;
		add(circle, x, y);
		double finalX = getWidth() - radius;
		while (true) {
			while (circle.getX() <= finalX) {
				circle.move(VEL_X, 0);
				pause(PAUSE_MS);
			}
			while (circle.getX() >= 0) {
				circle.move(-VEL_X, 0);
				pause(PAUSE_MS);
			}
		}

	}
}
