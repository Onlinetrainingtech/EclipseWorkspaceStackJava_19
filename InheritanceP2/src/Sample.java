class B
{
	int pid=1001;
	String pname="apple";
	int pprice=100;
}
class D1 extends B
{
	void get1()
	{
		System.out.println(""+pid);
	}
}
class D2 extends D1
{
	void get2()
	{
		System.out.println(""+pname+""+pprice);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();

	}

}
