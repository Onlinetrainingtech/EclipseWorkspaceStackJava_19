import java.util.Scanner;

class Demo
{
	int pid[][]=new int[2][2];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter the array value is::");
				pid[i][j]=sc.nextInt();
			}
		}
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Your array value is::"+pid[i][j]);
				
			}
		}
	}
}
public class Sample1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
