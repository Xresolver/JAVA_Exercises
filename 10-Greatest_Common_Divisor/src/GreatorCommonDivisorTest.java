/*
 * This class tests GreatorCommonDivisor class
 */

import java.util.Scanner;

public class GreatorCommonDivisorTest 
{
	public static void main(String args[])
	{
		int number1, number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("GCD OF TWO NUMBER \n");
		
		try
		{
			System.out.print("Please enter first number: ");
			number1 = input.nextInt();
			System.out.print("Please enter second number: ");
			number2 = input.nextInt();
		}
		finally 
		{
			input.close();
		}
		
		System.out.printf("%nGCD(%d, %d) = %d", number1, number2, 
				GreatestCommonDivisor.gcdOfTwoNumbers(number1, number2));
	}
}
