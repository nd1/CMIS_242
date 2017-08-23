// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This program shows the results of performing both shallow and deep 
// comparisons of objects of type Int.

package ints;

class ComparingObjects
{
	public static void main(String[] args)
	{
		Int int1 = new Int(1), int2 = new Int(1);
		Integer integer1 = new Integer(1), integer2 = new Integer(1);
		
		System.out.println("Shallow comparing Ints = " + (int1 == int2));
		System.out.println("Deep comparing Ints = " + int1.equals(int2));
		
		System.out.println("Shallow comparing Integers = " + (integer1 == integer2));
		System.out.println("Deep comparing Integers = " + integer1.equals(integer2));
	}
}