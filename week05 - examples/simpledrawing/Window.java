// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines the window that contains a Drawing panel
// that draws a several geometric objects of various colors.

package simpledrawing;

import java.awt.*;
import javax.swing.*;

class Window extends JFrame
{
	public Window()
	{
		super("Drawing Window");
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