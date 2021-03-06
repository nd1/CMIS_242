// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class defines a subclass of Student for undergraduate students. It 
// includes a method for determining whether a student is on the dean's list by 
// determing whether the student's current GPA is at least 3.8.

package student1;

class Undergraduate extends Student
{
	private static final double MIN_GPA = 3.8;
	
	public boolean onDeansList()
	{
		return computeGPA() >= MIN_GPA;
	}
}