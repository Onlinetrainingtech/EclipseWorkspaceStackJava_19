import java.util.Scanner;

public class Sample 
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
    void input()
    {
    	System.out.println("Enter the value is::");
    	empid=sc.nextInt();
    	empname=sc.next();
    }
    void display()
    {
    	System.out.println("Your value is::"+empid+""+empname);
    }
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
