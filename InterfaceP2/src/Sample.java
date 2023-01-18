interface B1
{
	int empid=1001;
	void get1();
}
interface B2 extends B1
{
	String empname="Azar";
	void get2();
}
class Demo implements B2
{
	public void get1()
	{
		System.out.println(""+empid);
	}
	public void get2()
	{
		System.out.println(""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
