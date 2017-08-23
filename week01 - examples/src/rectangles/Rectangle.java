// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This class defines a rectangle object that provides operations to compute
// its area and perimeter. It illustrates the use of a class variable that is 
// used to give each new object a successive ID.

package rectangles;

class Rectangle
{
   private static int nextId = 1;
   private int id;
   private double width, height;
   private String color;
   
   public Rectangle(double rectangleWidth, double rectangleHeight, String rectangleColor)
   {
      width = rectangleWidth;
      height = rectangleHeight;
      color = rectangleColor;
      id = nextId++;
   }
   @Override
   public String toString()
   {
      return ("Id = " + id + " width = "  + width + " height = " + height + " color = " + color);
   }
   public double getArea()
   {
      return width * height;
   }  
   public double getPerimeter()
   {
      return (width + height) * 2;
   }
}