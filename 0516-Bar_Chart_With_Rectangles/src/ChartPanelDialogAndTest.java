/* This class, show input dialogs for getting 5 integer data from user
 * and initiate a JFrame for show ChartPanel 
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChartPanelDialogAndTest
{
	public static void main(String args[])
	{
		int chartDatas[] = new int[5];
		
		String sNumber[] = new String[5];
		
		for(int i = 0; i < sNumber.length; i++)
		{
			/* get input data as String from user */ 
			sNumber[i] = JOptionPane.showInputDialog("Enter " + (i+1) + ". integer data:");
			
			/* convert and hold data as integer */
			chartDatas[i] = Integer.parseInt(sNumber[i]);
		}
		
		ChartPanel chartPanel = new ChartPanel(chartDatas);
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(chartPanel); // add the panel to the frame
		application.setSize(300, 300); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}
