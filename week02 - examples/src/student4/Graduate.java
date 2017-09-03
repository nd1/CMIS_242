
// This class defines a subclass of Student for graduate students. It is 
// the same as the previous version.

package student4;

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
	public String toString()
	{
		return super.toString() + " Undergraduate Major = " + undergraduateMajor;
	} 
}