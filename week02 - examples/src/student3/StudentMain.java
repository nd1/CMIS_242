// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class contains a main method that tests the student hierarchy. This
// version illustrates dynamic binding.

package student3;

class StudentMain
{
	public static void main(String[] args)
	{
		Student[] students = {new Graduate("John Smith", "CSEC", "CMSC"),
			new Undergraduate("Mary Smith", "CMIS"), new Student("Bill Jones", "IFSM")} ;
		for (Student student: students)
		{
			student.courseCompleted(3, 4);
			System.out.println(student);
			//System.out.println(student.onDeansList());
		}
	}
}