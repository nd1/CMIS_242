// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class define a superclass for students in general. In addition to the 
// previous version, it contains a constructor to initialize a student's name 
// and major and a tostring method to convert the student object to a string.

package student2;

class Student
{
	private String name, major;
	private int creditHours = 0, qualityPoints = 0;
	
	public Student(String name, String major)
	{
		this.name = name;
		this.major = major;
	}
	public void courseCompleted(int creditHours, int grade)
	{
		this.creditHours += creditHours;
		qualityPoints += creditHours * grade;
	}
	public double computeGPA()
	{
		return (double) qualityPoints / creditHours;
	}
	@Override
	public String toString()
	{
		return "Name = " + name + " Major = " + major + " GPA = " + computeGPA();
	}
}