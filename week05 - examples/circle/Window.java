// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines a window that contains a ColorableCircle panel.
// The color of the circle is specified by entering the color with RGB
// values in the textfield and then clicking the ChangeColor button.

package circle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Window extends JFrame
{
	private ColorableCircle panel = new ColorableCircle();
	private JTextField input = new JTextField(10);
	private JButton action = new JButton("Change Color");
	
	private class ButtonListener implements ActionListener
	{
        @Override
		public void actionPerformed(ActionEvent event)
		{
			String stringColor = input.getText();
			String[] colors = stringColor.split(",");
			setCircleColor(new Color(Integer.parseInt(colors[0]), Integer.parseInt(colors[1]),
				Integer.parseInt(colors[2])));
		}
	}
	
	public Window()
	{
		super("Colorable Circle with Input Panel");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		add(new JLabel("Enter Color RR,GG,BB: "));
		add(input);
		add(action);
		add(panel);
		action.addActionListener(new ButtonListener());
	}	
	public void setCircleColor(Color color)
	{
		panel.setCircleColor(color);
		panel.repaint();
	}

	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);

	}
}