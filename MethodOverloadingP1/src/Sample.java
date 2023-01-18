
public class Sample {

	public void get1(int pid,String pname)
	{
		System.out.println(""+pid+""+pname);
	}
	public void get1(int cid)
	{
		System.out.println(""+cid);
	}
	
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1(1001,"apple");
		s1.get1(2001);

	}

}
