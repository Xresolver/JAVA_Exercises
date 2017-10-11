/* This class draw 5 charts in a JPanel by using drawRect method
 * from graphics and fill them different colors using Color class.  
 */
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ChartPanel extends JPanel 
{
	int[] chartDatas = new int[5];
	
	public ChartPanel(int chartDatas[])
	{
		this.chartDatas = chartDatas;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int height = getHeight(); // total height
		
		int startPoint_x = 20;
		int startPoint_y = height;
		
		int thickness = 50;
		int unitIncrement = 10;
		
		Color c[] = new Color[5];
		c[0] = Color.blue;
		c[1] = Color.green;
		c[2] = Color.magenta;
		c[3] = Color.black;
		c[4] = Color.red;
		
		for(int i = 0; i < chartDatas.length;i++)
		{
			g.setColor(c[i]);
			g.fillRect(
					startPoint_x + i*thickness, 
					startPoint_y - (unitIncrement*chartDatas[i]), 
					thickness, 
					(unitIncrement*chartDatas[i])
					);

		}
		
	}
}
