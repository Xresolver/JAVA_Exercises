import javax.swing.JFrame;

public class RandomShapesTest 
{
	public static void main(String[] args) 
	{
		DrawRandomShapes panel = new DrawRandomShapes();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);


	}

}
