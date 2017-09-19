// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates displaying a window that contains a calculator 
// keypad laid out using the grid layout manager.

package windows;

import java.awt.*;
import javax.swing.*;

class Window3 extends JFrame
{
	public Window3()
	{
		super("Calculator Keys");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 3, 10, 10));
		for (int leftKey = 7; leftKey >= 0; leftKey -= 3)
			for (int key = leftKey; key < leftKey + 3; key++)
				add(new JButton("" + key));
		add(new JLabel(""));
		add(new JButton("0"));
	}
	public static void main(String[] args)
	{
		Window3 window = new Window3();
		window.setVisible(true);
	}
}