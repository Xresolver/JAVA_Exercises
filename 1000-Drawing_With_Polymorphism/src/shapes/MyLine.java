package shapes;

//MyLine class represents a line.
import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape
{	
	// constructor with no arguments
	public MyLine()
	{
		super();
	}
	
	
	// constructor with input values
	public MyLine(int x1, int y1, int x2, int y2, Color color)
	{
		super(x1, y1, x2, y2, color);
	}
	
	// Draw the line in the specified color
	@Override
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawLine(getX1(), getX2(), getY1(), getY2());
	}

} // end class MyLine
