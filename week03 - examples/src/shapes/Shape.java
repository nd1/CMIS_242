// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This superclass defines an abstract class for shapes with two abstract methods
// to compute the perimeter and area.

package shapes;

abstract class Shape 
{
	private String color;
	private boolean isSolid;
	
	public Shape(String color, boolean isSolid)
	{
		this.color = color;
		this.isSolid = isSolid;
	}
			
	public abstract double computePerimeter();
	public abstract double computeArea();
}