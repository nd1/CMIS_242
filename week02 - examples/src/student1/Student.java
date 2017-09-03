// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class define a superclass for students in general. It provides
// methods to update a grade record when a course is completed and another
// to compute the grade point average.

package student1;

class Student
{
	private int creditHours = 0, qualityPoints = 0;
	
	public void courseCompleted(int creditHours, int grade)
	{
		this.creditHours += creditHours;
		qualityPoints += creditHours * grade;
	}
	public double computeGPA()
	{
		return (double) qualityPoints / creditHours;
	}
}