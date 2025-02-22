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
			int x = (int) (Math.random()* 391) + 10;
			int y = (int) (Math.random()* 291) + 10;
			int x2 = (int) (Math.random()* 391) + 10;
			int y2 = (int) (Math.random()* 291) + 10;
			int red = (int) (Math.random()* 256);
			int blue = (int) (Math.random()* 256);
			int green = (int) (Math.random()* 256);
			g.setColor(new Color(red,green,blue));
			g.drawLine(x,y,x2,y2);
		}
		// Draw Random Squares
		for (int k=1; k<=100; k++)
		{
			int x = (int) (Math.random()* 341) + 400;
			int y = (int) (Math.random()* 241) + 10;
			int red = (int) (Math.random()* 256);
			int blue = (int) (Math.random()* 256);
			int green = (int) (Math.random()* 256);
			g.setColor(new Color(red,green,blue));
			g.fillRect(x,y,50,50);
		}
		// Draw Random Circles
		for (int k=1; k<=100; k++)
		{
			int d = (int) (Math.random()* 201);
			int x = (int) (Math.random()* (391-d)) + 10;
			int y = (int) (Math.random()* (291-d)) + 300;
			int red = (int) (Math.random()* 256);
			int blue = (int) (Math.random()* 256);
			int green = (int) (Math.random()* 256);
			g.setColor(new Color(red,green,blue));
			g.drawOval(x,y,d,d);
		}
		// Draw 3-D Box
		//red face
		g.setColor(new Color(255,0,0));
		g.fillRect(550,450,80,80);
		//blue face
		Polygon triangle = new Polygon();
		g.setColor(new Color(0,0,255));
		triangle.addPoint(630,450);
		triangle.addPoint(590,450);
		triangle.addPoint(590,410);
		g.fillPolygon(triangle);
		//yellow face
		Polygon trap = new Polygon();
		g.setColor(new Color(255,255,0));
		trap.addPoint(590,450);
		trap.addPoint(590,410);
		trap.addPoint(510,410);
		trap.addPoint(550,450);
		g.fillPolygon(trap);
		//green face
		Polygon diamond = new Polygon();
		g.setColor(new Color(0,255,0));
		diamond.addPoint(550,450);
		diamond.addPoint(510,410);
		diamond.addPoint(510,490);
		diamond.addPoint(550,530);
		g.fillPolygon(diamond);
	}

}
