// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class contains a main method that tests the Length class. It illustrates
// the difference between making the reference type Object compared to Length.

package length3;

class LengthMain
{
	public static void main(String[] args)
	{
		Length lengthA = new Length(1, 0), lengthB = new Length(0, 12);
		System.out.println(lengthA + " equals " + lengthB + " is " + lengthA.equals(lengthB) + '\n');

		Object lengthC = new Length(1, 0), lengthD = new Length(0, 12);
		System.out.println(lengthC + " equals " + lengthD + " is " + lengthC.equals(lengthD));
		
	}
} 