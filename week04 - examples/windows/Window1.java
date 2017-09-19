// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates displaying an empty window that terminates
// the progran when the window is closed.

package windows;

import javax.swing.*;

class Window1 extends JFrame
{
	public Window1()
	{
		super("Just a Window");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		Window1 window = new Window1();
		window.setVisible(true);
	}
}