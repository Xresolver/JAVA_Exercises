/* This program get binary number from user, 
 * then calculate and show its decimal equivalent. */
package exercise;

import java.util.Scanner;

public class DecimalEquivalentBinaryNumber 
{
	public static void main(String args[])
	{
		long binaryNumber;
		Scanner binaryInput = new Scanner(System.in);
		
		try
		{
			/* binary number is assigned from user */
			System.out.print("Enter binary number: ");
			binaryNumber = binaryInput.nextLong();
		}
		finally 
		{
			binaryInput.close();
		}
		
		System.out.println("(" + binaryNumber + ")\u2082 = " + binaryToDecimal(binaryNumber));
	}
	
	public static int binaryToDecimal(long binaryNumber)
	{
		int decimalNumber;
		int digitValue = 1;
		
		/* first digit is used for decimalNumber initialize */
		int digitSequence = 2;
		
		/* decimalNumber initialization */
		decimalNumber = (int) (binaryNumber % 10);
		binaryNumber /= 10;
		
		while(binaryNumber != 0)
		{
			if(binaryNumber%2 != 0)
				for(int i = digitSequence; i > 1; i--)
					digitValue *= 2; 
			else
				digitValue = 0;
			
			decimalNumber += digitValue;
			digitValue = 1;
			binaryNumber /= 10;
			digitSequence++; 
		}
		return decimalNumber;
	}
}
