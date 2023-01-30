class Demo
{
	void get1()
	{
		try
		{
		int a=100/0;
		System.out.println("Your data is::"+a);
		
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the input...");
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function..");
	}
	void get3()
	{
		try
		{
			String name="azar";
			System.out.println("Your data is::"+name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check the input");
		}
		finally
		{
			System.out.println("finally block..");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//t1.get1();
		t1.get3();
	}

}
