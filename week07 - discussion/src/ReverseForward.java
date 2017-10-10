// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This program illustrates the use of an array list. It reads in a list
// of integers and outputs them first in reverse order and then in forward
// order using a for-each loop.



import java.util.*;

class ReverseForward
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		ArrayList names = new ArrayList();
		String name;
		
		while (true)
		{
			System.out.print("Enter a name, enter return to stop: ");
			name = stdin.nextLine();
			if (name.length() == 0)
				break;
			names.add(name);
		}
		for (int i = names.size() - 1; i >= 0; i--)
		{
			name = (String) names.get(i);
			System.out.println(name);
		}
		for (Object name_: names)
			System.out.println(name_);
	}
}