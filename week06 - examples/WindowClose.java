// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This program shows how to include code that will be executed when the window
// is about to close.

import java.awt.event.*;
import javax.swing.*;

class WindowClose extends JFrame
{
	private class WindowCloser extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent windowEvent)
		{
			JOptionPane.showMessageDialog(null, "Window is about to close");
			System.exit(0);
		}
	}

	public WindowClose()
	{
		super("Window Close Example");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowCloser());
	}

	public static void main(String[] args)
	{
		WindowClose frame = new WindowClose();
		frame.setVisible(true);
	}
}
