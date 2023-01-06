import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int empid,salary;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void input()throws IOException
	{
		System.out.println("Enter the empid is::");
		empid=Integer.parseInt(dis.readLine());
		
		System.out.println("Enter the salary is::");
		salary=Integer.parseInt(dis.readLine());
		
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+salary+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
