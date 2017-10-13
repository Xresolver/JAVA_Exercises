/*
 * Program that uses classes at shape package
 * to draw random shapes.
 */

package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import shapes.*;

public class DrawPanel extends JPanel
{
	private SecureRandom randomNumbers = new SecureRandom();
	private MyShape[] shapes; // array of shapes
	private int numberLine, numberOval, numberRect;
	
	// constructor, creates a panel with random shapes
	public DrawPanel()
	{
		setBackground(Color.WHITE);
		
		String numberShapeString = JOptionPane.
								   		showInputDialog("Enter number of shapes that will draw on panel: ");
		int numberShape;
		
		// exception handling for number format and interval
		do
		{	
			try
			{
				numberShape = Integer.parseInt(numberShapeString);
				
				if(numberShape < 0)
					numberShapeString = JOptionPane.
										showInputDialog("Your number must be positive" +
														"\nTry Again: ");
				
			}
			catch(NumberFormatException numberFormatException)
			{
				numberShape = -1;
				numberShapeString = JOptionPane.
										showInputDialog("Your number must be just a number" +
														"\nTry Again: ");
			}
		}while(numberShape < 0);
		
		
		shapes = new MyShape[numberShape];
		
		numberLine = randomNumbers.nextInt(1 + numberShape);
		numberOval = randomNumbers.nextInt(1 + numberShape - numberLine);
		numberRect = numberShape - numberLine - numberOval;

				// create ovals
		for (int count = 0; count < shapes.length; count++)
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
			
			if(count < numberLine)
			{
				// add the line to the list of shapes to be displayed
				shapes[count] = new MyLine(x1, y1, x2, y2, color);
			}
			else if(count < (numberLine + numberOval))
			{
				// add the oval to the list of shapes to be displayed
				shapes[count] = new MyOval(x1, y1, x2, y2, color, flag);
			}
			else
			{
				// add the rectangle to the list of shapes to be displayed
				shapes[count] = new MyRectangle(x1, y1, x2, y2, color, flag);
			}
		}
	}
	
	// for each shape instance, draw the individual shape.
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// draw the shapes
		for (MyShape shape : shapes)
			shape.draw(g);

	}
	
	public String getStatus()
	{
		return String.format("Lines: %d, Ovals: %d, Rectangles: %d", numberLine, numberOval, numberRect);
	}
	
} // end class DrawPanel