// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines a window that contains a ColorableCircle panel.
// The color of the circle is specified by clicking one of three radio
// buttons specifying red, blue or yellow.

package radiobuttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import circle.ColorableCircle;
        
class Window extends JFrame
{
	private ColorableCircle circlePanel = new ColorableCircle();
	
	class ColorPanel extends JPanel
	{
		private JRadioButton red = new JRadioButton("Red"),
			blue = new JRadioButton("Blue"), 
			yellow = new JRadioButton("Yellow");

		public ColorPanel()
		{
			setLayout(new GridLayout(3,1));
			add(red);
			add(blue);
			add(yellow);
			ButtonGroup group = new ButtonGroup();
			group.add(red);
			group.add(blue);
			group.add(yellow);
			// code below as lamdba expressions instead
			red.addItemListener(event ->processColorChange(Color.RED));
			blue.addItemListener(event ->processColorChange(Color.BLUE));
			yellow.addItemListener(event ->processColorChange(Color.YELLOW));
			
			/*red.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent event)
					{
						processColorChange(Color.RED);
					}
				});
			blue.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent event)
					{
						processColorChange(Color.BLUE);
					}
				});
			yellow.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent event)
					{
						processColorChange(Color.YELLOW);
					}
				});*/
		}
	}
	
	public Window()
	{
		super("Colorable Circle with Radio Buttons");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 10));
		add(new ColorPanel(), BorderLayout.WEST);
		add(circlePanel, BorderLayout.EAST);
	}	
	public void processColorChange(Color color)
	{
		circlePanel.setCircleColor(color);
		circlePanel.repaint();
	}

	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);
	}
}