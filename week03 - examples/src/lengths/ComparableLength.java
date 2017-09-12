// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class defines length objects that are able to be cloned and deep
// compared.

package lengths;

class ComparableLength implements Cloneable, Comparable<ComparableLength>
{
	private static final int INCHES_PER_FOOT = 12;
	private int feet, inches;
	
	public ComparableLength(int feet, int inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public int compareTo(ComparableLength other)
	{
		ComparableLength otherLength = (ComparableLength) other; 
		return toInches() - otherLength.toInches();
	}
	@Override
	public boolean equals(Object length)
	{
		if (!(length instanceof ComparableLength))
			return false;
		return toInches() == ((ComparableLength)length).toInches();
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
	