import java.applet.*;
import java.awt.*;
/* <applet code = "q4" width = 200 height = 100><param name="param1" value="14">
  <param name="param2" value="2"> </applet> */
public class q4 extends Applet
{
	public void paint (Graphics g)
	{
		Color customColor = new Color(10,10,255);
		
		setForeground(customColor);
		String input1 = this.getParameter("param1");
		String input2 = this.getParameter("param2");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int a = 25, b = 65;
		g.drawString("GCD FOR " + input1 + "&" + input2 + " :", 25, 50);
		int gcd = 0;
		for(int i = 1; i <= num1 || i <= num2; ++i) {
        		if(num1%i==0 && num2%i==0)
           			gcd=i;
		}
      			g.drawString(gcd + "", a, b);
			
			
		showStatus("This is a status window.");
   	}
	
}
