package shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape 
{
	private int x1; // x-coordinate of first endpoint
	private int y1; // y-coordinate of first endpoint
	private int x2; // x-coordinate of second endpoint
	private int y2; // y-coordinate of second endpoint
	private Color color; // color of this shape

	// constructor with no arguments
	public MyShape()
	{
		this.x1 	= 0;
		this.x2		= 0;
		this.y1     = 0;
		this.y2     = 0;
		this.color  = Color.BLACK;
	}
	
	// constructor with input values
	public MyShape(int x1, int y1, int x2, int y2, Color color)
	{
		this.x1 = cordinateValidator(x1);	
		this.x2 = cordinateValidator(x2);
		this.y1 = cordinateValidator(y1);
		this.y2 = cordinateValidator(y2);
		this.color = color;
	}
	
	public void setX1(int x1){	this.x1 = cordinateValidator(x1);	}
	
	public void setX2(int x2){	this.x2 = cordinateValidator(x2);	}
	
	public void setY1(int y1){	this.y1 = cordinateValidator(y1);	}
	
	public void setY2(int y2){	this.y2 = cordinateValidator(y2);	}
	
	public void setColor(Color color){	this.color = color;	}
	
	public int getX1() {	return x1;	}

	public int getY1() {	return y1;	}

	public int getX2() {	return x2;	}

	public int getY2() {	return y2;	}

	public Color getColor() {	return color;	}
	
	private static int cordinateValidator(int coordinate)
	{
		if(coordinate < 0)
			return 0;
		else
			return coordinate;
	}
	
	// Draw the shape
	public abstract void draw(Graphics g);
}
