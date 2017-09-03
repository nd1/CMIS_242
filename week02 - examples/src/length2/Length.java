// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class defines a length in feet and inches. In addition to the previous
// version it contains a method to perform a deep comparison and a toString
// method to converts length objects to strings.

package length2;

class Length
{
	private static final int INCHES_PER_FOOT = 12;
	private int feet, inches;
	
	public Length(int feet, int inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	public boolean equals(Length length)
	{
		return toInches() == length.toInches();
	}
	public String toString(boolean useNames)
	{
		if (useNames)
			return feet + " ft " + inches + " in";
		return feet + "' " + inches + "\"";
	}
	private int toInches()
	{
		return feet * INCHES_PER_FOOT + inches;
	}
}
	