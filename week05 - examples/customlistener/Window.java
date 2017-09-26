// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines a window that contains a ColorableCircle panel.
// The color of the circle is specified by clicking one of three radio
// buttons specifying red, blue or yellow. This implementation makes use
// of the custom listener ColorListener.

package customlistener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import circle.ColorableCircle;

class Window extends JFrame implements ColorListener
{
	private ColorableCircle circlePanel = new ColorableCircle();
	
	public Window()
	{
		super("Colorable Circle with Radio Buttons");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel buttonPanel = new JPanel();
		setLayout(new BorderLayout(10, 10));
		add(new ColorPanel(this), BorderLayout.WEST);
		add(circlePanel, BorderLayout.EAST);
	}	
    @Override
	public void processColorChange(Color color)
	{
		circlePanel.setCircleColor(color);
		circlePanel.repaint();
	}

	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);
	}
}