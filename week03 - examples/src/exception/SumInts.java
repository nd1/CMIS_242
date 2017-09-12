// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This program illustrates the use of a try-catch block to catch nonumeric
// input and reprompt when it occurs.

package exception;

import java.util.*;

class SumInts
{
	private static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args)
	{
		int value, sum = 0, errorCount = 0;
		
		while (true)
			try
			{
				System.out.print("Enter a positive integer, 0 to quit: ");
				value = stdin.nextInt();
				if (value == 0)
					break;
				sum += value;
			}
			catch (InputMismatchException exception)
			{
				stdin.nextLine();
				System.out.print("Input was not an integer, ");
			}
		System.out.println("Sum = " + sum);
	}
}