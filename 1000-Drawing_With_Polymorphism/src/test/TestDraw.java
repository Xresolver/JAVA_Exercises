package test;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

import draw.DrawPanel;

public class TestDraw 
{

	public static void main(String[] args)
	{
		DrawPanel panel = new DrawPanel();
		// JLabel as a status bar that displays counts 
		// representing the number of each shape displayed.
		JLabel staus = new JLabel(panel.getStatus());
		
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.add(staus, BorderLayout.SOUTH);
		app.setSize(300, 300);
		app.setVisible(true);
	}
} // end class TestDraw
