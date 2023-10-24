
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		 
		int width = 100;
		int height = 100;
		
		double x1 = 10;
		double y1 = 10;
		double x2 = 110;
		double y2 = 110;
		
		GLine verticalLine = new GLine(x1,y1,x1,y2);
		add(verticalLine);
		
		
	}

}
