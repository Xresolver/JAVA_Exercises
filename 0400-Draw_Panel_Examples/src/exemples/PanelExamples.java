package exemples;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelExamples extends JPanel
{
	private String design;
	
	public PanelExamples(String design)
	{
		this.design = design;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int width = getWidth(); 
		int height = getHeight();
		
		switch(design)
		{
			case "Panel Example-01":
				for(int i=0; i<=15 ;i++)
				{
					g.drawLine(0, 0, (width*i)/15, (height*(15-i))/15);
				}
				break;
				
			case "Panel Example-02":
				for(int i=0; i<=15 ;i++)
				{
					g.drawLine(0, 0, (width*i)/15, (height*(15-i))/15);
					g.drawLine(width, 0, width - (width*i)/15, (height*(15-i))/15);
					g.drawLine(0, height, (width*i)/15, height - (height*(15-i))/15);
					g.drawLine(width, height, width - (width*i)/15, height - (height*(15-i))/15);
				}
				break;
			
			case "Panel Example-03":
				for(int i=0; i<15 ;i++)
				{
					g.drawLine(0, (height*i)/15, (width*(i+1))/15, height);
				}
				break;
				
			case "Panel Example-04":
				for(int i=0; i<15 ;i++)
				{
					g.drawLine(0, (height*i)/15, (width*(i+1))/15, height);
					g.drawLine(width, (height*i)/15, width - (width*(i+1))/15, height);
					g.drawLine(0, height - (height*i)/15, (width*(i+1))/15, 0);
					g.drawLine(width, height - (height*i)/15, width - (width*(i+1))/15, 0);
				}
				break;
		}
		
	}

}
