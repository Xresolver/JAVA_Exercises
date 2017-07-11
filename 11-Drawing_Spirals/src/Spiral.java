/*
 * This class include 2 spiral design that use JPanel class
 * Which design will be utilized, is decided with 
 * String variable (design) of constructor
 *  
 */

import java.awt.Graphics;

import javax.swing.JPanel;

public class Spiral extends JPanel
{
	private static final int RADIUS = 10;
	private static final int INCREMENT_FACTOR = 20;
	private String design;
	
	public Spiral(String design)
	{
		this.design = design;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int width = getWidth(); 
		int height = getHeight();
		
		/*
		 *  Initialize starting point for spiral-01 
		 */
		int startingPoint_x = width/2;
		int startingPoint_y = height/2;
		
		/*
		 *  Initialize first center of arc for spiral-012 
		 */
		int centerArc_x = width/2;
		int centerArc_y = height/2; 
		
		switch(design)
		{
			case "Spiral-01":
				for(int i=1; i<=25 ;i++)
				{
					if( (i%4) == 1 )
					{
						g.drawLine( 
										startingPoint_x,
										startingPoint_y, 
										startingPoint_x,
										startingPoint_y + (INCREMENT_FACTOR*i)
								   	);
						
						startingPoint_y = startingPoint_y + (INCREMENT_FACTOR*i);
					
					}
					
					else if( (i%4) == 2 )
					{
						g.drawLine( 
										startingPoint_x,
										startingPoint_y, 
										startingPoint_x - (INCREMENT_FACTOR*(i-1)),
										startingPoint_y
									);
						
						startingPoint_x = startingPoint_x - (INCREMENT_FACTOR*(i-1));
					
					}
					
					else if( (i%4) == 3 )
					{
						g.drawLine( 
										startingPoint_x,
										startingPoint_y, 
										startingPoint_x,
										startingPoint_y - (INCREMENT_FACTOR*i)
									);		
						
						startingPoint_y = startingPoint_y - (INCREMENT_FACTOR*i);
					
					}
					
					else if( (i%4) == 0 )
					{
						g.drawLine( 
										startingPoint_x,
										startingPoint_y, 
										startingPoint_x + (INCREMENT_FACTOR*(i-1)),
										startingPoint_y
									);
						
						startingPoint_x = startingPoint_x + (INCREMENT_FACTOR*(i-1));
					
					}
					
				}
				break;
				
			case "Spiral-02":
				for(int i=1; i<=25 ;i++)
				{
					if( (i%2) == 1 )
					{
						g.drawArc( 
									centerArc_x - i*RADIUS,
									centerArc_y - i*RADIUS,
									2*i*RADIUS,
									2*i*RADIUS,
									0,
									180
								   );
						
						centerArc_x = centerArc_x - RADIUS;

					}
					
					else if( (i%2) == 0 )
					{
						g.drawArc( 
									centerArc_x - i*RADIUS,
									centerArc_y - i*RADIUS,
									2*i*RADIUS,
									2*i*RADIUS,
									0,
									-180
								  );
					
						centerArc_x = centerArc_x + RADIUS;
		
					}
					
				}
				break;
			
		}
		
	}

}