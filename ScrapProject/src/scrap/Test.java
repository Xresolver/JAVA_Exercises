package scrap;


public class Test
{
	public static void main(String args[])
	{
		Test01 test1 = new Test02();
		System.out.println(test1);
		
//		test1.write("1");
		
		Test02 test2 = (Test02) test1;
		test2.write("2");

		Test03 test3 = new Test03();
		Test04 test4 = (Test04) test3;
		test4.write("3");
	}
	
}

abstract class Test01
{
	@Override
	public abstract String toString();

}

class Test02 extends Test01
{

	@Override
	public String toString() 
	{
		
		return "Hello World!!";
	}
	
	public void write(String writing)
	{
		System.out.printf("%s%n", writing);
	}
	
}

class Test03
{

}

class Test04 extends Test03
{
	public void write(String writing)
	{
		System.out.printf("%s%n", writing);
	}
}