// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class defines a window that contains a ColorableCircle panel.
// The color of the circle is specified by a list that specifies
// the color mixture and a combo box that specifies the intensity.
// In addition, a slider allows the user to select the circle size.

package controls;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import circle.ColorableCircle;

class Window extends JFrame 
{
	private ColorableCircle circlePanel = new ColorableCircle();
	private JList colors = new JList(new Object[] {"Red Component", "Green Component", "Blue Component"});
	private JComboBox intensity = new JComboBox(new Object[] {"Brightest", "Bright", "Medium", "Dark", "Darkest"});
	private JSlider sizeAdjuster = new JSlider();
	private int[] colorMix = {0, 1, 2};
	private int shade = 5;
	
	public Window()
	{
		super("Colorable Circle with Controls");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(10, 10));
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
		controlPanel.add(colors);
		controlPanel.add(Box.createRigidArea(new Dimension(50, 35)));
		controlPanel.add(intensity);
		controlPanel.add(Box.createRigidArea(new Dimension(50, 35)));
		controlPanel.add(sizeAdjuster);
		
		add(controlPanel, BorderLayout.WEST);
		add(circlePanel, BorderLayout.EAST);
		
		// changes commented code to lambda
		colors.addListSelectionListener((ListSelectionEvent event) -> {
		    colorMix = colors.getSelectedIndices();
		    setColor(); });
		/*colors.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent event)
			{
				colorMix = colors.getSelectedIndices();
				setColor();
			}
		});*/
		intensity.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent event)
			{
				shade = 5 - intensity.getSelectedIndex();
				setColor();
			}
		});
		sizeAdjuster.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent event)
			{
				double value = sizeAdjuster.getValue();
				circlePanel.setCircleSize((int) value);
				circlePanel.repaint();
			}
		});
	}
	private void setColor()
	{
		int colorValues[] = {0x330000,0x003300, 0x000033};
		int color = 0;
		for (int index: colorMix)
			color += colorValues[index] * shade;
		circlePanel.setCircleColor(new Color(color));
		circlePanel.repaint();
	}	

	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);
	}
}