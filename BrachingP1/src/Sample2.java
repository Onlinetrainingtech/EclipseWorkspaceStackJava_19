import java.util.Scanner;

class Demo
{
	int age,sal,bns,i,n;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	  System.out.println("Enter the age is::");
	  age=sc.nextInt();
	  if(age>=60)
	  {
		  System.out.println("Enter the salary is::");
		  sal=sc.nextInt();
		  if(sal>=2000)
		  {
			  bns=sal+500;
			  System.out.println("Your bns is::"+bns);
		  }
		  else
		  {
			  bns=sal+1000;
			  System.out.println("Your bns is::"+bns);
		  }
	  }
	  else
	  {
		  System.out.println("Your is age low");
	  }
	}
}
public class Sample2 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
