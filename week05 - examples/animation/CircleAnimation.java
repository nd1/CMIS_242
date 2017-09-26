// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class implements a paintable panel that animates a circle that
// expands and contracts. As the circle expands it becomes a brighter blue.

package animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CircleAnimation extends JPanel implements ActionListener
{
	private static final int CENTER = 250, INCREMENT = 2, OFFSET = 40, DELAY = 20;
	private Timer timer;
	private int radius;
	private boolean increasing = true;
	
	public CircleAnimation()
	{
		timer = new Timer(DELAY, this);
		timer.start();
		radius = INCREMENT;
	}

    @Override
	public void actionPerformed(ActionEvent event)
	{
		if (increasing)
		{
			if (radius > CENTER)
				increasing = false;
			else
				radius += INCREMENT;
		}
		else
		{
			if (radius < INCREMENT)
				increasing = true;
			else
				radius -= INCREMENT;
		}
		repaint();
	}
	
    @Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.setColor(new Color(0, 0, radius));
		int x = CENTER - radius / 2, y = CENTER - radius / 2 - OFFSET;
		graphics.fillOval(x, y, radius, radius);
	}
}