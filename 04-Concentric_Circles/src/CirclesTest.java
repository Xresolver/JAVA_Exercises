import javax.swing.JFrame;

public class CirclesTest 
{
	public static void main(String[] args)
	{
		Circles circlesPanel = new Circles();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(circlesPanel); // add the panel to the frame
		application.setSize(300, 300); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}
