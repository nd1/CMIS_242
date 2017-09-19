// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates the action of copying the text in the input 
// textfield to the output textfield when a button is clicked and
// converting it to either lower or upper case depending on the button.
// The window itself is the listener for the button clicks.

package actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Action1 extends JFrame implements ActionListener
{
	private JTextField input = new JTextField(20), output = new JTextField(20);
	private JButton upper = new JButton("Upper"), lower = new JButton("Lower");
	
	public Action1()
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
		lower.addActionListener(this);
		upper.addActionListener(this);
	}	
    @Override
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == lower)
			output.setText(input.getText().toLowerCase());
		else
			output.setText(input.getText().toUpperCase());
	}
	public static void main(String[] args)
	{
		Action1 frame = new Action1();
		frame.setVisible(true);
	}
}