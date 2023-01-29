import java.util.ArrayDeque;

public class Sample {

	
	void get1()
	{
		ArrayDeque<Integer>obj=new ArrayDeque<Integer>();
		obj.addFirst(2001);
		obj.add(1001);
		obj.add(1002);
		obj.add(1003);
		obj.add(1004);
		obj.addLast(2003);
		System.out.println("Your data is::"+obj);
		System.out.println(""+obj.getFirst());
		System.out.println(""+obj.getLast());
		
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
