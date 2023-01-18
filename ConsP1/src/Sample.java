class Demo
{
	Demo()
	{
		System.out.println("Default cons..");
	}
	Demo(int cid)
	{
		System.out.println("Param cons...");
	}
	void get1()
	{
		System.out.println("Normal function..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		new Demo(1001);
		t1.get1();

	}

}
