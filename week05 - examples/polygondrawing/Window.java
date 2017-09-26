// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines the window that contains a paintable panel object
// that draws a polygon uses the vertices selected by the user with mouse 
// clicks at those locations.

package polygondrawing;

import javax.swing.*;

class Window extends JFrame
{
	public Window()
	{
		super("Polygon Drawing Window");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Drawing());	
	}
	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);
	}
}	