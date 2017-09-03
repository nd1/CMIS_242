// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class defines a subclass of Student for undergraduate students. It is 
// the same as the previous version.

package student3;

class Undergraduate extends Student
{
	private static final double MIN_GPA = 3.8;
	
	public Undergraduate(String name, String major)
	{
		super(name, major);
	}
	public boolean onDeansList()
	{
		return computeGPA() >= MIN_GPA;
	}
}