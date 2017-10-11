package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle 
{
	private int x1; // x-coordinate of first endpoint
	private int y1; // y-coordinate of first endpoint
	private int x2; // x-coordinate of second endpoint
	private int y2; // y-coordinate of second endpoint
	private Color color; // color of this line
	private boolean flag;
	
	// constructor with no arguments
	public MyRectangle()
	{
		this.x1 	= 0;
		this.x2		= 0;
		this.y1     = 0;
		this.y2     = 0;
		this.color  = Color.BLACK;
		this.flag   = false;
	}
	
	// constructor with input values
	public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean flag)
	{

		this.x1 = cordinateValidator(x1);	
		this.x2 = cordinateValidator(x2);
		this.y1 = cordinateValidator(y1);
		this.y2 = cordinateValidator(y2);
		
		this.color = color;
		this.flag = flag;
	}
	
	public void setX1(int x1){	this.x1 = cordinateValidator(x1);	}
	
	public void setX2(int x2){	this.x2 = cordinateValidator(x2);	}
	
	public void setY1(int y1){	this.y1 = cordinateValidator(y1);	}
	
	public void setY2(int y2){	this.y2 = cordinateValidator(y2);	}
	
	public void setColor(Color color){	this.color = color;	}
	
	public void setFlag(boolean flag){	this.flag = flag;	}
	
	public int getX1() {	return x1;	}

	public int getY1() {	return y1;	}

	public int getX2() {	return x2;	}

	public int getY2() {	return y2;	}

	public Color getColor() {	return color;	}

	public boolean isFlag() {	return flag;	}
	
	public int getUpperLeftX() 
	{
		if(getX1() < getX2())
			return getX1();
		else
			return getX2();
	}

	public int getUpperLeftY() 
	{
		if(getY1() < getY2())
			return getY1();
		else
			return getY2();
	}

	public int getWidth() 
	{
		int differenceBetweenX = (getX1() - getX2());
		
		if(differenceBetweenX >= 0)
			return differenceBetweenX;
		else 
			return -differenceBetweenX;
	}

	public int getHeight() 
	{
		int differenceBetweenY = (getY1() - getY2());
		
		if(differenceBetweenY >= 0)
			return differenceBetweenY;
		else 
			return -differenceBetweenY;

	}
	
	private static int cordinateValidator(int coordinate)
	{
		if(coordinate < 0)
			return 0;
		else
			return coordinate;
	}
	
	// Draw the Rectangle in the specified color
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		
		if(this.flag == true)
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
	}
}
