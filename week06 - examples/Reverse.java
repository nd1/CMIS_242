// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This class contains a recursive method that reverses a file of integers.
// This problem is an excellent use of recursion because if solved with
// iteration would require the use of a stack.

import java.io.*;
import java.util.*;

class Reverse
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("values.txt"));
		reverse(file);
	}
	private static void reverse(Scanner file)
	{
		if (!file.hasNextInt())
			return;
		int value = file.nextInt();
		reverse(file);
		System.out.println(value);
	}
}
