import java.applet.*;
import java.awt.*;
/* <applet code = "q2" width = 200 height = 60><PARAM name="Message" value="23"></applet> */
public class q2 extends Applet
{
	public void paint (Graphics g)
	{
		Color customColor = new Color(10,10,255);
		
		setForeground(customColor);
		String inputFromPage = this.getParameter("Message");
		int num = Integer.parseInt(inputFromPage);
		int a = 25, b = 65;
		g.drawString("Table for " + inputFromPage + ":", 25, 50);
		for(int i = 1; i <= 10; i++) {
      			g.drawString (inputFromPage + "*" + (i + "") + " = " + ((i*num) + "" ) , a, b);
			
			b += 15;
		}
		showStatus("This is a status window.");
   	}
	
}
