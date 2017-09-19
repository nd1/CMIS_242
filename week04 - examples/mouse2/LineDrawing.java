// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This class defines a panel that draws lines connecting the points 
// on the panel where the mouse was clicked.
// The listener for mouse events is an anonymous inner class that extends
// the MouseAdapter class so only mouseClicked needs to be implemented.

package mouse2;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LineDrawing extends JPanel
{
	private ArrayList points = new ArrayList();
	
	public LineDrawing()
	{
		addMouseListener(new MouseAdapter()
		{
            @Override
			public void mouseClicked(MouseEvent event)
			{
				Point clickPoint = event.getPoint();
				points.add(clickPoint);
				repaint();
			}
		});
	}

    @Override
	protected void paintComponent(Graphics graphics)
	{
		if (points.size() < 1)
			return;
		Point from = (Point)points.get(0);
		for (int i = 1; i < points.size(); i++)
		{
			Point to = (Point)points.get(i);
			graphics.drawLine(from.x, from.y, to.x, to.y);
			from = to;
		}
	}
}