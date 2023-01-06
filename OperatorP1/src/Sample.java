class Demo
{
	void ArithmeticOperator()
	{
		int a=100,b=200;
		System.out.println("Add:::"+(a+b));
		System.out.println("Mul::"+(a*b));
		System.out.println("Divided:::"+(a/b));
	}
	void relationalOperator()
	{
		int a1=200,b1=100;
		System.out.println("Lessthan::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("Equal::"+(a1==b1));
		System.out.println("NotEqual::"+(a1!=b1));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//t1.ArithmeticOperator();
		t1.relationalOperator();

	}

}
