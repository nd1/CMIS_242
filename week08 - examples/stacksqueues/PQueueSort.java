// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This program reads in a file of integers and adds them to a priority queue.
// It then removes them and outputs them in sorted order.

package stacksqueues;

import java.io.*;
import java.util.*;

class PQueueSort
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("ints.txt"));
		Queue<Integer> queue = new PriorityQueue();
		
		while (file.hasNextInt())
		{
			int i = file.nextInt();
			queue.add(i);
		}
		while(!queue.isEmpty())
			System.out.println(queue.remove());
	}
}	