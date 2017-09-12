// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class contains a main method to test the Shape hierarchy.

package shapes;

public class TestShapes 
{
	public static void main(String[] args)
	{
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle ("Black", true, 5,8);
		shapes[1] = new Circle ("Red", false, 7);
		shapes[2] = new Rectangle ("white", false, 3,4);
		double totalArea = 0.;

		for(Shape shape:shapes)
			totalArea += shape.computeArea();
		System.out.println("Total area = " + totalArea);
	}	
}