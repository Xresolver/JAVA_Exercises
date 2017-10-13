package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape
{
	// constructor with no arguments
	public MyOval()
	{
		super();
	}
	
	// constructor with input values
	public MyOval(int x1, int y1, int x2, int y2, Color color, boolean flag)
	{
		super(x1, y1, x2, y2, color, flag);
	}
	

	// Draw the oval in the specified color
	@Override
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		
		if(this.isFlag() == true)
			g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
	}
}
