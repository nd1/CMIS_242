package actions;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Action6 extends JFrame
{
	private JTextField input = new JTextField(20), output = new JTextField(20);
	private JButton echo = new JButton("Echo");
	private JRadioButton upper = new JRadioButton("Upper"), lower = new JRadioButton("Lower");
	
	public Action6()
	{
		super("Echo Text");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(echo);
		add(input);
		add(output);
		lower.setSelected(true);
		ButtonGroup group = new ButtonGroup();
		add(lower);
		add(upper);
		group.add(lower);
		group.add(upper);
		output.setEditable(false);
		echo.addActionListener(new ActionListener()
		{
            @Override
			public void actionPerformed(ActionEvent event)
			{
            	if (lower.isSelected())
            		output.setText(input.getText().toLowerCase());
            	else
            		output.setText(input.getText().toUpperCase());
			}
		});
	}	
	public static void main(String[] args)
	{
		Action6 frame = new Action6();
		frame.setVisible(true);
	}
}