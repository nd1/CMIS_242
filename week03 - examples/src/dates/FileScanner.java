// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This is a utility class that contains a method to continually reprompt the 
// user until the file of a file that can be opened is input. It returns a 
// Scanner object for that file. No objects can be created of this class.

package dates;

import java.io.*;
import java.util.*;

class FileScanner
{
	private static Scanner stdin = new Scanner(System.in);
	
	private FileScanner()
	{
	}
	public static Scanner openFile()
	{
		String fileName;
		
		while (true)
			try
			{
				System.out.print("Enter file name: ");
				fileName = stdin.next();
				File file = new File(fileName);
				return new Scanner(file);
			}
			catch (FileNotFoundException exception)
			{
				System.out.println("No Such File, Reenter name: ");
			}
	}
}
		