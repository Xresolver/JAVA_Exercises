/* This class draw 12 concentric circles in the center of a JPanel, 
 * the innermost circle have 10 pixel radius, 
 * every circle's radius 10 pixel bigger than another.
 */

import java.awt.Graphics;

import javax.swing.JPanel;

public class Circles extends JPanel 
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		final int RADIUS = 10;
		int width = getWidth(); // total width
		int height = getHeight(); // total height
		
		int upperLeft_x = width/2 - RADIUS;
		int upperLeft_y = height/2 - RADIUS;
		
		for(int i = 0; i < 12; i++)
			g.drawOval(
						(upperLeft_x - i*RADIUS), 
						(upperLeft_y - i*RADIUS), 
						2*(RADIUS + i*10), 
						2*(RADIUS + i*10)
					  );
		
	}
}
