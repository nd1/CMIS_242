// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class defines a subclass of Student for graduate students. In addition
// to the previous version, it overrides the toString method that would
// otherwise be inherited.

package student3;

class Graduate extends Student
{
	private static final double MIN_GPA = 3.9;
	private String undergraduateMajor;
	
	public Graduate(String name, String major, String undergraduateMajor)
	{
		super(name, major);
		this.undergraduateMajor = undergraduateMajor;
	}
	public boolean onDeansList()
	{
		return computeGPA() >= MIN_GPA;
	}
	@Override
	public String toString()
	{
		return super.toString() + " Undergraduate Major = " + undergraduateMajor;
	} 
}