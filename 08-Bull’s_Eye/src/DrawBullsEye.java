/* 
 * Drawing a bull’s-eye that alternates between two random colors using method fillOval.
 */

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

public class DrawBullsEye extends JPanel 
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		/* odd circles' RGB values */
		int rO = randomNumbers.nextInt(255);
		int gO = randomNumbers.nextInt(255);
		int bO = randomNumbers.nextInt(255);
		
		/* even circles' RGB values */
		int rE = randomNumbers.nextInt(255);
		int gE = randomNumbers.nextInt(255);
		int bE = randomNumbers.nextInt(255);
		
		Color oddOvalsColor  = new Color(rO, gO, bO);
		Color evenOvalsColor = new Color(rE, gE, bE);
		
		/* start point of fillOval method */
		int x = 10;
		int y = 10;
		
		for(int diameter = 200; diameter > 0; diameter-=20)
		{
			/* draw odd circles */
			if(diameter%40 != 0)
			{
				g.setColor(oddOvalsColor);
				g.fillOval(x, y, diameter, diameter);	
				System.out.println("odd");
			}
			/* draw even circles */
			else
			{
				g.setColor(evenOvalsColor);
				g.fillOval(x, y, diameter, diameter);
				System.out.println("even");
			}
			
			/* changing x and y for immobilize center of circumference */
			x += 10;
			y += 10;
		}

	}
}
