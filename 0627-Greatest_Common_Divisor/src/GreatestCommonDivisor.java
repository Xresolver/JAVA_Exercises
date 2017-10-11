/*
 * This class have a method that calculate greatest common division of two integers
 * by using Euclid's Algorithm
 */

public class GreatestCommonDivisor 
{
	public static int gcdOfTwoNumbers(int number1, int number2)
	{
		if(number2 != 0)
		{
			return gcdOfTwoNumbers(number2, number1%number2);
		}
		else
		{
			return number1;
		}
	}
}
