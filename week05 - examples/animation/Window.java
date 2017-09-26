// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines the window that contains a CircleAnimation panel
// that animates a circle that expands and contracts.

package animation;

import java.awt.*;
import javax.swing.*;

class Window extends JFrame
{
	public Window()
	{
		super("Animation Drawing Window");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new CircleAnimation());	
	}
	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);
	}
}	