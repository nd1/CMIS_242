// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates displaying a window that contains
// a label, a textfield, a button, a checkbox and a radio button 
// laid out with the flow layout manager.

package windows;

import java.awt.*;
import javax.swing.*;

class Window2 extends JFrame
{
	public Window2()
	{
		super("Window with Components");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new JLabel("A Label"));
		add(new JTextField(10));
		add(new JButton("Button"));
		add(new JCheckBox("Box"));
		add(new JRadioButton("Radio"));
	}
	public static void main(String[] args)
	{
		Window2 window = new Window2();
		window.setVisible(true);
	}
}