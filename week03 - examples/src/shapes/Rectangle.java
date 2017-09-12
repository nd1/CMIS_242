// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class defines subclass of Shape that defines a rectangle. It overrides
// the methods to compute the perimeter and area.

package shapes;

class Rectangle extends Shape 
{
	private int height, width;
	
	public Rectangle(String color, boolean isSolid, int height, int width)
	{
		super(color, isSolid);
		this.height = height;
		this.width = width;
	}
	@Override
	public double computePerimeter()
	{
		return(height + width) * 2;
	}
	@Override
	public double computeArea()
	{
		return height * width;
	}
}