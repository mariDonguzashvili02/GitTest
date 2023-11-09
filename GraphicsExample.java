import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsExample  extends GraphicsProgram{
	public void init(){
		
	}
	public void run(){
		GRect rect = new GRect(100,100);
		
		
		addMouseListeners();
		
		while(true){
			pause(10);
		}
	}
}
