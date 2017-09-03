// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This class contains a main method that tests the student hierarchy.

package student1;

class StudentMain
{
	public static void main(String[] args)
	{
		Graduate student1 = new Graduate();
		student1.courseCompleted(3, 4);
		System.out.println(student1.onDeansList());
		
		Undergraduate student2 = new Undergraduate();
		student2.courseCompleted(3, 4);
		student2.courseCompleted(3, 3);
		System.out.println(student2.onDeansList());
	}
}