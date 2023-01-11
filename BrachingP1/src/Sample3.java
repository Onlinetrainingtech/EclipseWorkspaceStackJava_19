import java.util.Scanner;

class Demo1
{
	int m1,m2,m3,tot;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
		System.out.println("Enter the m1,m2,m3::");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		tot=m1+m2+m3;
		if(tot>=900)
		{
			System.out.println("Grade-A");
		}
		else if(tot>=700)
		{
			System.out.println("Grade-B");
		}
		else if(tot>=500)
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Grade-D");
		}
	}
}
public class Sample3 {

	public static void main(String[] args) {
		
		Demo1 n=new Demo1();
		n.get1();

	}

}
