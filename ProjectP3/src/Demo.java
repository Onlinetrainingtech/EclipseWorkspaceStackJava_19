class Sample
{
	String pname="apple";//global variable
	void get1()
	{
		int pid=1001;//local variable
		System.out.println("Get1 function.."+pid);
	}
	void get2()
	{
		System.out.println("Get2 function.."+pname);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();

	}

}
