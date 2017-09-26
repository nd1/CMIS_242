// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class implements a paintable panel that draws a polygon uses the
// vertices selected by the user with mouse clicks at those locations.
// In addition, the function keys F1, F2 and F3 can be used to change the
// mode. F1 clears the screen. F2 puts the program into a mode where the user 
// clicks the mouse at any point and it responds with a message indicating
// whether that point is inside or outside the polygon. F3 returns to drawing
// mode without reinitializing.

package polygondrawing;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Drawing extends JPanel
{
	private ArrayList points = new ArrayList();
	private Polygon polygon = new Polygon();
	private boolean drawingMode = true;
	
	public Drawing()
	{
		setFocusable(true);
		addMouseListener(new MouseAdapter()
		{
            @Override
			public void mouseClicked(MouseEvent event)
			{
				Point point = event.getPoint();
				if (drawingMode)
				{
					polygon.addPoint(point.x, point.y);
					repaint();
				}
				else
				{
					if (polygon.contains(point.x, point.y))
						JOptionPane.showMessageDialog(null, "Point is Inside");
					else
						JOptionPane.showMessageDialog(null, "Point is Outside");
				}
			}
		});
		addKeyListener(new KeyAdapter()
		{
            @Override
			public void keyPressed(KeyEvent event)
			{
				switch (event.getKeyCode())
				{
					case KeyEvent.VK_F1:
						polygon = new Polygon();
						drawingMode = true;
						break;
					case KeyEvent.VK_F2:
						drawingMode = false;
						break;
					case KeyEvent.VK_F3:
						drawingMode = true;
						break;
						
				}
				repaint();
			}
		});
	}

    @Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.setColor(Color.GRAY);
		graphics.fillPolygon(polygon);
	}
}