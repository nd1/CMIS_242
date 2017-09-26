// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This class implements a paintable panel that draws a several
// geometric objects of various colors.

package simpledrawing;

import java.awt.*;
import javax.swing.*;

class Drawing extends JPanel
{
    @Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.setColor(Color.RED);
		graphics.drawRect(20, 20, 200, 200);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Hollow Red Square", 50, 120);
		graphics.setColor(Color.BLUE);
		graphics.fillOval(300, 20, 200, 200);
		graphics.setColor(Color.WHITE);
		graphics.drawString("Solid Blue Circle", 350, 120);
		graphics.setColor(new Color(0, 128, 0));
		graphics.fillRect(20, 250, 400, 200);
		graphics.setColor(Color.YELLOW);
		graphics.fillOval(220, 280, 250, 150);
	}
}	