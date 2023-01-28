import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Demo
{
	//HashSet<Integer>list1=new HashSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1003);
		System.out.println("Your data is::"+list1);
		System.out.println("Your data size is::"+list1.size());
		System.out.println("Remove your data is::"+list1.remove(1001));
		System.out.println("Searching the data is::"+list1.contains(1001));
		Iterator h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println("Inside the while::"+h1.next());
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();

	}

}
