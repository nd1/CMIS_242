// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This program reads in a file of integers and adds each integer to both
// ends of a list and the outputs that list, which is now a palindrome.
// It makes use of the LinkedList class from the Java Collection Framework.

package collections;

import java.io.*;
import java.util.*;

class PalindromeList
{
	public static void main(String[] args) throws Exception
	{
		Scanner file = new Scanner(new File("ints.txt"));
		LinkedList<Integer> list = new LinkedList();
		
		while (file.hasNextInt())
		{
			int value = file.nextInt();
			list.addFirst(value);
			list.addLast(value);
		}
		for (Integer value: list)
			System.out.print(value + " ");
		System.out.println();
	}
}			