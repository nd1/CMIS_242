// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This program reads in a file of integers and adds them to a collection
// implemented with an array list. It then uses both an explicit an implicit
// iterator to display all the elements of the collection.

package collections;

import java.io.*;
import java.util.*;

class Iteration
{
	public static void main(String[] args) throws Exception
	{
		Scanner file = new Scanner(new File("ints.txt"));
		Collection<Integer> list = new ArrayList();
		
		while (file.hasNextInt())
		{
			int i = file.nextInt();
			list.add(i);
		}
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		for (Integer i: list)
			System.out.print(i + " ");
		System.out.println();
	}
}			