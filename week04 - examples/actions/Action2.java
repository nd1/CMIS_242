// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates the action of copying the text in the input 
// textfield to the output textfield when a button is clicked and
// converting it to either lower or upper case depending on the button.
// The listener is an anonymous object of a named inner class.

package actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Action2 extends JFrame
{
	private JTextField input = new JTextField(20), output = new JTextField(20);
	private JButton upper = new JButton("Upper"), lower = new JButton("Lower");
	
	private class ButtonListener implements ActionListener
	{
        @Override
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == lower)
				output.setText(input.getText().toLowerCase());
			else
				output.setText(input.getText().toUpperCase());
		}
	}
	
	public Action2()
	{
		super("Echo Text");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(input);
		add(output);
		output.setEditable(false);
		add(lower);
		add(upper);
		ButtonListener listener = new ButtonListener();
		lower.addActionListener(listener);
		upper.addActionListener(listener);
	}	
	public static void main(String[] args)
	{
		Action2 frame = new Action2();
		frame.setVisible(true);
	}
}