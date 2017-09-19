// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This example illustrates the use of colors and fonts laid out with the
// border layout manager.

package windows;

import java.awt.*;
import javax.swing.*;

class Window4 extends JFrame
{
	public Window4()
	{
		super("Colors and Fonts");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel label1 = new JLabel("16 Point Sans Serif Bold in Blue");
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("San Serif", Font.BOLD, 16));
		add(label1, BorderLayout.NORTH);
		JLabel label2 = new JLabel("20 Point Serif Italic in Dark Red");
		label2.setForeground(new Color(128, 0, 0));
		label2.setFont(new Font("Serif", Font.ITALIC, 20));
		add(label2, BorderLayout.SOUTH);
	}
	public static void main(String[] args)
	{
		Window4 window = new Window4();
		window.setVisible(true);
	}
}