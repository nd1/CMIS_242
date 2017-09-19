// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This class defines a window that contains an instance of the LineDrawing
// class.

package mouse2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DrawingWindow extends JFrame
{
	public DrawingWindow()
	{
		super("Line Drawing Window");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add (new LineDrawing());
	}	

	public static void main(String[] args)
	{
		DrawingWindow frame = new DrawingWindow();
		frame.setVisible(true);
	}
}