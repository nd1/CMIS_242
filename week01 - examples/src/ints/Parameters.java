// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This program illustrates the effect of making changes to different types of 
// parameters, both primitives and mutable objects. The mutable objects are
// changed in two different ways, by modifying the object itself and modifying 
// the reference.

package ints;

public class Parameters 
{
	public static void main(String [] args)
		{
		int value1 = 1;
		Int value2 = new Int(1), value3 = new Int(1);
		modify(value1, value2, value3);
		System.out.println( "value1 = " + value1 +
			" value2 = " + value2 + " value3 = " + value3);
	}

	private static void modify(int value1, Int value2, Int value3)
	{
		value1 = 2;
		value2.setInt(2);
		value3 = new Int(2);
	}
}