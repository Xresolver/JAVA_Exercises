/*
 * This class create a panel that include 2 selection button
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SpiralSelection extends JPanel
{	
	private String selectedRadioButton = new String();
	
	public SpiralSelection()
	{
		
		JRadioButton r1 = new JRadioButton("Spiral-01");
		JRadioButton r2 = new JRadioButton("Spiral-02");

	
		JButton buttonOK = new JButton("OK");
		
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);

		this.add(r1);
		this.add(r2);
		this.add(buttonOK);
	
		buttonOK.addActionListener
		(
			new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent event) 
				{
					if(r1.isSelected())
						selectedRadioButton = r1.getText();
					else if(r2.isSelected())
						selectedRadioButton = r2.getText();

					
					Spiral spiral = new Spiral(selectedRadioButton);
					
					// create a new frame to hold the panel
					JFrame application = new JFrame();
					
					// set the frame to exit when it is closed
					application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					application.add(spiral); 		// add a spiral to the frame
					application.setSize(250, 250); 	// set the size of the frame
					application.setVisible(true); 	// make the frame visible	
					
				
				}
			}
		);
		
	}
	
}