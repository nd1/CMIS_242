// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class implements a paintable panel that draws a circle.
// The color of the circle is initially black but can be changed by calling
// the setCircleColor method.

package circle;

import java.awt.*;
import javax.swing.*;

public class ColorableCircle extends JPanel
{
	private static final int PANEL_SIZE = 150, DIAMETER = 50;
	private Color circleColor = Color.BLACK;
	private int circleDiameter = DIAMETER;
		
    @Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.setColor(circleColor);
		graphics.fillOval((PANEL_SIZE - circleDiameter) / 2, (PANEL_SIZE - circleDiameter) / 2, 
			circleDiameter, circleDiameter);
	}
	public void setCircleColor(Color color)
	{
		circleColor = color;
		repaint();
	}	
	public void setCircleSize(int diameter)
	{
		circleDiameter = diameter;
		repaint();
	}
    @Override
	public Dimension getPreferredSize()
	{
		return new Dimension(PANEL_SIZE, PANEL_SIZE);
	}
}
