//Program that uses classes at shape package
//to draw random lines.

package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

import shapes.*;

public class DrawPanel extends JPanel
{
	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines; // array of lines
	private MyOval[] ovals;
	private MyRectangle[] rects;
	
	// constructor, creates a panel with random shapes
	public DrawPanel()
	{
		setBackground(Color.WHITE);
		lines = new MyLine[1 + randomNumbers.nextInt(5)];
		ovals = new MyOval[1 + randomNumbers.nextInt(5)];
		rects = new MyRectangle[1 + randomNumbers.nextInt(5)];
		
		// create lines
		for (int count = 0; count < lines.length; count++)
		{
			// generate random coordinates
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			// generate a random color
			Color color = new Color(randomNumbers.nextInt(256),
									randomNumbers.nextInt(256), 
									randomNumbers.nextInt(256));
			
			// add the line to the list of lines to be displayed
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
		
		// create ovals
		for (int count = 0; count < ovals.length; count++)
		{
			// generate random coordinates
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			// generate a random color
			Color color = new Color(randomNumbers.nextInt(256),
									randomNumbers.nextInt(256), 
									randomNumbers.nextInt(256));
			
			// generate a random flag
			boolean flag = randomNumbers.nextBoolean();
			
			// add the oval to the list of ovals to be displayed
			ovals[count] = new MyOval(x1, y1, x2, y2, color, flag);
		}

		// create rectangles
		for (int count = 0; count < rects.length; count++)
		{
			// generate random coordinates
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			// generate a random color
			Color color = new Color(randomNumbers.nextInt(256),
									randomNumbers.nextInt(256), 
									randomNumbers.nextInt(256));
			
			// generate a random flag
			boolean flag = randomNumbers.nextBoolean();
			
			// add the rectangle to the list of rects to be displayed
			rects[count] = new MyRectangle(x1, y1, x2, y2, color, flag);
		}

	}
	
	// for each shape array, draw the individual shapes
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// draw the lines
		for (MyLine line : lines)
			line.draw(g);
	
		// draw the ovals
		for (MyOval oval : ovals)
			oval.draw(g);

		// draw the rectangles
		for (MyRectangle rect : rects)
			rect.draw(g);

	}
	
	public String getStatus()
	{
		return String.format("Lines: %d, Ovals: %d, Rectangles: %d", 
								lines.length, ovals.length, rects.length);
	}
	
} // end class DrawPanel