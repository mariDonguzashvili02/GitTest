
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		 
		int width = 100;
		int height = 100;
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 100;
		double y2 = 100;

		
		for(int i = 0; i > 10 ; i++){
			
			x1 += 10;
			y1 += 10;
			x2 += 10;
			y2 += 10;
			
			GLine verticalLine = new GLine(x1,y1,x1,y2);
			add(verticalLine);
			
		}
		
		
	}

}
