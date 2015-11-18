import java.applet.*;
import java.awt.*;
/* <applet code = "q1" width = 200 height = 60></applet> */
public class q1 extends Applet
{
	public void paint (Graphics g)
	{
		Color customColor = new Color(10,10,255);
		//setBackground(customColor);
		setForeground(customColor);
      		g.drawString ("Welcome to applet programming!", 25, 50);
		showStatus("This is a ststus window.");
   	}
	
}
