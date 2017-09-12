// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This program tests the Date hierarchy by reading in a file of dates. Valid
// dates are written to an output file. Invalid dates are displayed on the
// console with a message explaining the format problem.

package dates;

import java.io.*;
import java.util.*;

class ValidateDates
{
	public static void main(String[] args)
	{
		String dateString = "";
		CheckedDate date;
		Scanner input = FileScanner.openFile();
		PrintWriter output;
		
		try
		{
			output = new PrintWriter("output.txt");
			while (input.hasNext())
			{
				try
				{
					dateString = input.next();
					date = CheckedDate.fromString(dateString);
					output.println(date);
				}
				catch (InvalidDate exception)
				{
					System.out.println(dateString + " " + exception.getMessage());					
				}
			}
			output.close();
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("Cannot create output file");
		}
		finally
		{
			input.close();
		}
	}
}