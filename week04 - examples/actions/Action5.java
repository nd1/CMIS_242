// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates the action of copying the text in the input 
// textfield to the output textfield when a button is clicked and
// converting it to either lower or upper case depending on the button.
// The listeners are named lambda expressions.

package actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Action5 extends JFrame
{
	private JTextField input = new JTextField(20), output = new JTextField(20);
	private JButton upper = new JButton("Upper"), lower = new JButton("Lower");
	
	ActionListener lowerListener = 
			event -> output.setText(input.getText().toLowerCase());
	ActionListener upperListener = 
			event -> output.setText(input.getText().toUpperCase());
		
	public Action5()
	{
		super("Echo Text");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(input);
		add(output);
		output.setEditable(false);
		add(lower);
		lower.addActionListener(lowerListener);
		add(upper);
		upper.addActionListener(upperListener);
	}
	public static void main(String[] args)
	{
		Action5 frame = new Action5();
		frame.setVisible(true);
	}
}