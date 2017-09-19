// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates displaying a window that contains a calculator 
// keypad in a nested panel containing a labeled border with the addition of
// tooltips on two new keys together with a textfield above the keypad.

package windows;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Window5 extends JFrame
{
	public Window5()
	{
		super("Calculator with Text Field");
		setSize(200, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel numberPad = new JPanel();
		
		numberPad.setLayout(new GridLayout(4, 3, 10, 10));
		for (int leftKey = 7; leftKey >= 0; leftKey -= 3)
			for (int key = leftKey; key < leftKey + 3; key++)
				numberPad.add(new JButton("" + key));
		JButton clearEntry = new JButton("CE");
		
		clearEntry.setToolTipText("Clear Entry");
		numberPad.add(clearEntry);
		numberPad.add(new JButton("0"));
		JButton clear = new JButton("C");
		clear.setToolTipText("Clear All");
		numberPad.add(clear);
		numberPad.setBorder(new TitledBorder("Key Pad"));
		setLayout(new BorderLayout());
		add(new JTextField(30), BorderLayout.NORTH);
		add(numberPad, BorderLayout.SOUTH);
	}
	public static void main(String[] args)
	{
		Window5 window = new Window5();
		window.setVisible(true);
	}
}