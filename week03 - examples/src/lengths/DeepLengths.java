// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class contains a main method to test shallow and deep comparisons of
// lengths that have been shallow and deep copied.

package lengths;

import java.util.*;

class DeepLengths
{
	public static void main(String[] args) throws Exception
	{
		ComparableLength length1 = new ComparableLength(1, 0), 
			length2 = new ComparableLength(1, 6), length3;
		System.out.println("Comparison = " + length1.compareTo(length2));
		
		length3 = (ComparableLength)length1.clone();
		System.out.println("Shallow compare = " + (length1 == length3));
		System.out.println("Deep compare = " + length1.equals(length3));
	}	
}