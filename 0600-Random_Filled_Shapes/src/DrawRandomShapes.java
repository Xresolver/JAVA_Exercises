import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawRandomShapes extends JPanel 
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Color shapeColor;
		
		/* RGB values for color of shape */
		int red;
		int green;
		int blue;
		
		/* upper left corner coordinates for fillRectangle and fillOval methods */
		int x;
		int y;
		
		int shapeWidth;
		int shapeHeight;
		
		for(int i = 0; i < 10; i++)
		{
			red = randomNumbers.nextInt(255);
			green = randomNumbers.nextInt(255);
			blue = randomNumbers.nextInt(255);
			shapeColor = new Color(red, green, blue);
		
			/* upper left corner must be in the panel */
			x = randomNumbers.nextInt(getWidth());
			y = randomNumbers.nextInt(getHeight());
			
			/* width and height of shape must be smaller than 
			 * difference between width and height of panel 
			 * and left corner of shape
			 */
			shapeWidth = randomNumbers.nextInt(getWidth() - x);
			shapeHeight = randomNumbers.nextInt(getHeight() - y);
			
			/* we randomize shape */
			if(randomNumbers.nextBoolean() == true)
			{
				g.setColor(shapeColor);
				g.fillRect(x, y, shapeWidth, shapeHeight);
			}
			else
			{
				g.setColor(shapeColor);
				g.fillOval(x, y, shapeWidth, shapeHeight);	
			}
		}
	}
}
