package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape
{
	// constructor with no arguments
	public MyRectangle()
	{
		super();
	}
	
	// constructor with input values
	public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean flag)
	{
		super(x1, y1, x2, y2, color, flag);
	}
	

	// Draw the rectangle in the specified color
	@Override
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		
		if(this.isFlag() == true)
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
	}
}