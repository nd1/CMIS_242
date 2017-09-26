// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This program draws a fractal image of a blue circle in which a red square
// is inscribed. The diameter of each circle is half that of the one in which
// it is contained.

import java.awt.*;
import javax.swing.*;

public class SquareInCircle extends JFrame
{

	public SquareInCircle()
	{
		super("Square In Circle Fractal");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Drawing());
	}
	class Drawing extends JPanel
	{
		private static final int X_CENTER = 200, Y_CENTER = 200, OFFSET = 35;
	
		public void paintComponent(Graphics graphics)
		{
			draw(graphics, 200);
		}
		private void draw(Graphics graphics, int radius)
		{
			if (radius == 0)
				return;
			int diameter, halfSide, side, xCircle, yCircle, xSquare, ySquare;
			halfSide = (int)(Math.sqrt(Math.pow(radius, 2) / 2) + .5);
			diameter = radius * 2;
			side = halfSide * 2;
			xCircle = X_CENTER - radius + OFFSET;
			yCircle = Y_CENTER - radius + OFFSET;
			xSquare = X_CENTER - halfSide + OFFSET;
			ySquare = Y_CENTER - halfSide + OFFSET;
			graphics.setColor(Color.BLUE);
			graphics.fillOval(xCircle, yCircle, diameter, diameter);
			graphics.setColor(Color.RED);
			graphics.fillRect(xSquare, ySquare,	side, side);
			draw(graphics, radius / 2);
		}
	}
	public static void main(String[] args)
	{
		SquareInCircle window = new SquareInCircle();
		window.setVisible(true);
	}
}