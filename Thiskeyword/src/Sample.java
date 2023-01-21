class Demo
{
	int a1,b1;
	void get1(int pid,int cid)
	{
		this.a1=pid;
		this.b1=cid;
		System.out.println("Your data is::"+pid+""+cid);
	}
	void get2()
	{
		System.out.println("Your data is::"+a1+""+b1);
	}
	void get3()
	{
		System.out.println("Your data is::"+a1+""+b1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1(100,2001);
		t1.get2();
		t1.get3();
	}

}
