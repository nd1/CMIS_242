// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This program reads in a file of integers and inserts then into a list
// implemented with an array list in their proper position to form a sorted
// list. That sorted list is then displayed.

package collections;

import java.io.*;
import java.util.*;

class SortedList
{
	public static void main(String[] args) throws Exception
	{
		Scanner file = new Scanner(new File("ints.txt"));
		List<Integer> list = new ArrayList();
		
		while (file.hasNextInt())
		{
			int value = file.nextInt();
			int i = 0;
			while (i < list.size() && list.get(i) < value)
				i++;
			list.add(i, value);
		}
		for (Integer value: list)
			System.out.print(value + " ");
		System.out.println();
	}
}			