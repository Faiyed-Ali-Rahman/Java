import java.awt.*;
import java.awt.event.*;

class WindowSensor extends WindowAdapter
{
	public void windowClosing(WindowEvent we){
		System.out.println("Window closing");
		System.exit(0);
	}
}