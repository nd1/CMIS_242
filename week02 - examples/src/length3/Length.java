// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class defines a length in feet and inches. Unlike the previous
// version it contains a method to perform a deep comparison that overrides
// the equals method and a toString that overrides the toString method of Object.

package length3;

class Length
{
	private static final int INCHES_PER_FOOT = 12;
	private int feet, inches;
	
	public Length(int feet, int inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	@Override
	public boolean equals(Object length)
	{
		if (!(length instanceof Length))
			return false;
		return toInches() == ((Length)length).toInches();
	}
	@Override
	public String toString()
	{
		return feet + "' " + inches + "\"";
	}
	private int toInches()
	{
		return feet * INCHES_PER_FOOT + inches;
	}
}
	