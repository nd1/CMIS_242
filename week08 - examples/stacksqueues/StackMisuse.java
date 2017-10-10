// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This program illustrates why making the Stack class a subclass of Vector
// was a bad design. It shows that an element can be removed from the middle of 
// the stack.

package stacksqueues;

import java.io.*;
import java.util.*;

class StackMisuse
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("ints.txt"));
		Stack<Integer> stack = new Stack();
		
		while (file.hasNextInt())
		{
			int i = file.nextInt();
			stack.push(i);
		}
		stack.remove(3);
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
}			