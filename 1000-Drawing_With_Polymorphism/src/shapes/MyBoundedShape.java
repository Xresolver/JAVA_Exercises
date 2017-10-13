package shapes;

import java.awt.Color;

public abstract class MyBoundedShape extends MyShape 
{
	private boolean flag;
	
	// constructor with no arguments
	public MyBoundedShape() 
	{
		super();
		this.flag = false;
	}
	
	// constructor with input values
	public MyBoundedShape(int x1, int y1, int x2, int y2, Color color, boolean flag)
	{
		super(x1, y1, x2, y2, color);
		this.flag = flag;
	}
	
	public void setFlag(boolean flag){	this.flag = flag;	}
	
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
}
