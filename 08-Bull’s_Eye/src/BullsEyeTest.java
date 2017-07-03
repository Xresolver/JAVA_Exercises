/*
 * // Test application that displays a Bull's Eye.
 */

import javax.swing.JFrame;

public class BullsEyeTest 
{

	public static void main(String[] args) 
	{
		DrawBullsEye panel = new DrawBullsEye();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);

	}

}
