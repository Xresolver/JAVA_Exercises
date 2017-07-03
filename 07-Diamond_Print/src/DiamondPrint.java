/* This program print a diamond of asterisks which have length user want */

import java.util.Scanner;

public class DiamondPrint 
{
	public static void main(String args[])
	{
		int diamondHeight;
		
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter diamond height as odd integer between 1 and 101:");
			diamondHeight = input.nextInt();
		}
		finally
		{
			input.close();
		}
		
		/* first half of diamond */
		for(int i = 1; i <= diamondHeight/2 + 1;i++)
		{
			for(int j = i; j <= diamondHeight/2; j++)
				System.out.print(" ");
			for(int j = 1; j <= 2*i-1; j++)
				System.out.print("*");
			System.out.println("");
		}
		
		/* second half of diamond */
		for(int i = 1; i <= diamondHeight/2; i++)
		{	
			for(int j = 1; j <= i; j++)
				System.out.print(" ");
			for(int j = 1; j <= 2 * (diamondHeight/2 + 1 - i) - 1; j++)
				System.out.print("*");
			System.out.println("");
		}
			

	}
}
