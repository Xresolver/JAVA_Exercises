/*
 * This Program find and show pythagorean triples 
 * that length of sides are less than or equal to 500
 */
public class TriplesTable 
{
	public static void main(String args[])
	{
		int triplesCount = 0;
		
		System.out.printf("%8s%8s%12s%n","side-1","side-2","hypotenuse");
		
		for(int side1=1;side1 < 500;side1++)
			for(int side2 = side1; side2 < 500; side2++)
				for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
					if(side1*side1+side2*side2==hypotenuse*hypotenuse)
					{
						System.out.printf("%8d%8d%12d%n",side1,side2,hypotenuse);
						triplesCount++;
					}
			
		System.out.println("\n" + triplesCount + " different pythagorean triples founded");
	}
}
