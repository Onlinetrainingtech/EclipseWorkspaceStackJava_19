interface B
{
	int pid=100;
	void get1();
}
class Demo implements B
{
	public void get1()
	{
		System.out.println("Your value is::"+pid);
	}
	void nfun()
	{
		System.out.println("Normal function..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.nfun();

	}

}
