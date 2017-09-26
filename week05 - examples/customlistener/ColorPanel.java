// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines a panel that allows a color to be selected by clicking one 
// of three radio buttons specifying red, blue or yellow.

package customlistener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorPanel extends JPanel
{
	private JRadioButton red = new JRadioButton("Red"),
		blue = new JRadioButton("Blue"), 
		yellow = new JRadioButton("Yellow");

	public ColorPanel(ColorListener colorListener)
	{
		setLayout(new GridLayout(3,1));
		add(red);
		add(blue);
		add(yellow);
		ButtonGroup group = new ButtonGroup();
		group.add(red);
		group.add(blue);
		group.add(yellow);
		// lambda of below commented code
		red.addItemListener(event -> colorListener.processColorChange(Color.RED));
		/*red.addItemListener(new ItemListener()
			{
                @Override
				public void itemStateChanged(ItemEvent event)
				{
					colorListener.processColorChange(Color.RED);
				}
			});*/
		blue.addItemListener(new ItemListener()
			{
                @Override
				public void itemStateChanged(ItemEvent event)
				{
					colorListener.processColorChange(Color.BLUE);
				}
			});
		yellow.addItemListener(new ItemListener()
			{
                @Override
				public void itemStateChanged(ItemEvent event)
				{
					colorListener.processColorChange(Color.YELLOW);
				}
			});
	}
}