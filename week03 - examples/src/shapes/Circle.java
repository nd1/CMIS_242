// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class defines subclass of Shape that defines a circle. It overrides
// the methods to compute the perimeter and area.

package shapes;

class Circle extends Shape 
{
	private int radius;
	
	public Circle(String color, boolean isSolid, int radius)
	{
		super(color, isSolid);
		this.radius = radius;
	}
	@Override
	public double computePerimeter()
	{
		return 2 * Math.PI * radius;
	}
	@Override
	public double computeArea()
	{
		return Math.PI * radius * radius;
	}
}