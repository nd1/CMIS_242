// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class defines length objects that are able to be added.

package lengths;

class AddableLength implements Addable
{
	private static final int INCHES_PER_FOOT = 12;
	private int feet, inches;

	public AddableLength(int feet, int inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	@Override
	public void addTo(Addable other)
	{
		AddableLength otherLength = (AddableLength)other;
		feet += otherLength.feet;
		inches += otherLength.inches;
		normalize();
	}
	private void normalize()
	{
		int totalInches = toInches();
		feet = totalInches / INCHES_PER_FOOT;
		inches = totalInches % INCHES_PER_FOOT;
	}
	private int toInches()
	{
		return feet * INCHES_PER_FOOT + inches;
	}
	@Override
	public String toString()
	{
		return feet + "' " + inches + "\"";
	}
}