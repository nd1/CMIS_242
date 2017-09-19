// CMIS 242 
// Duane J. Jarc
// June 9, 2015
// Week 4 Examples

// This class defines a panel that draws lines connecting the points 
// on the panel where the mouse was clicked.
// The panel itself is the listener for mouse events and implements the
// MouseListener interface so all methods of the interface must be 
// implemented.

package mouse1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LineDrawing extends JPanel implements MouseListener
{
	private ArrayList points = new ArrayList();
	
	public LineDrawing()
	{
		addMouseListener(this);
	}
    @Override
	public void mouseClicked(MouseEvent event)
	{
		Point clickPoint = event.getPoint();
		points.add(clickPoint);
		repaint();
	}
    @Override
    public void mousePressed(MouseEvent event)
	{
	}
    @Override
	public void mouseReleased(MouseEvent event)
	{
	}
    @Override
	public void mouseEntered(MouseEvent event)
	{
	}
    @Override
    public void mouseExited(MouseEvent event) 
    {
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