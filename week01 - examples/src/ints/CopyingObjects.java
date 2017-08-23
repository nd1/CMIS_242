// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This program shows the results of performing both shallow and deep 
// compying of objects of type Int.

package ints;

class CopyingObjects
{
	public static void main(String[] args)
	{
		Int int1 = new Int(1), int2 = int1, int3 = new Int(int1);
		Integer integer1 = new Integer(1), integer2 = integer1, 
			integer3 = new Integer(integer1);
				
		int1.setInt(2);
		System.out.println("int2 = " + int2 + " int3 = " + int3);
		integer1 = new Integer(2);
		System.out.println("integer2 = " + integer2 + " integer3 = " + integer3);
	}
}