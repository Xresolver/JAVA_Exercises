/* This simple addition program use JOptionPane */

import javax.swing.JOptionPane;

public class AdditionWithDialog 
{
	public static void main(String args[])
	{
		String sNumber1 = JOptionPane.showInputDialog("Enter first integer:");
		String sNumber2 = JOptionPane.showInputDialog("Enter second integer:");
		
		Integer number1 = Integer.parseInt(sNumber1);
		Integer number2 = Integer.parseInt(sNumber2);
		
		int sum; // sum of number1 and number2
		
		sum = number1 + number2; // add numbers, then store total in sum
	
		// create the message
		String message = String.format("%d + %d = %d", number1, number2, sum);
		
		// display the message
		JOptionPane.showMessageDialog(null, message);
		
	}

}
