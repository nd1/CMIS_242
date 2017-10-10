// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This program reads in a file of integers and pushes them onto a stack and
// then continually pops the stack to output them in reverse order.
// It uses a nongeneric stack implemented with an array of objects.

package reverse1;

import java.io.*;
import java.util.*;

class ReverseIntegers
{
	public static void main(String[] args) throws Exception
	{
		Scanner file = new Scanner(new File("ints.txt"));
		ObjectStack stack = new ObjectStack();
		
		while (file.hasNextInt())
		{
			int i = file.nextInt();
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			Integer i = (Integer) stack.pop();
			System.out.println(i);
		}
	}
}			