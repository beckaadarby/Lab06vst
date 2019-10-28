// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

	public void paint(Graphics g)
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);



		// Draw Random Lines
		for (int k=1; k<=100; k++)
		{
			int x = (int) (Math.random()* 391 + 10);
			int y = (int) (Math.random()* 291 + 10);
			int x2 = (int) (Math.random()* 391 + 10);
			int y2 = (int) (Math.random()* 291 + 10);
			int red = (int) (Math.random()* 257 + 0);
			int blue = (int) (Math.random()* 257 + 0);
			int green = (int) (Math.random()* 257 + 0);
			g.setColor(new Color(red,green,blue));
			g.drawLine(x,y,x2,y2);

		}




		// Draw Random Squares





		// Draw Random Circles





		// Draw 3-D Box





	}

}
