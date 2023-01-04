class Demo
{
	void fun1(int pid,String pname)
	{
		System.out.println("Your value is::"+pid+""+pname);
	}
	void fun2(int cid,String cname)
	{
		System.out.println("Your value is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) 
	{
	
		Demo t1=new Demo();
		t1.fun1(1001,"apple");
		t1.fun2(2001,"xyz");

	}

}
