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
	void logicalOperator()
	{
		int a2=200,b2=300;
		System.out.println("LogicalAND::"+((a2<b2)&&(b2>a2)));
		System.out.println("LogicalOR::"+((a2>b2)||(b2>a2)));
	}
	void bitwiseoperator()
	{
		int a=2,b=3;
		System.out.println("BitwiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("Rightshift::"+(a>>1));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//t1.ArithmeticOperator();
		//t1.relationalOperator();
		//t1.logicalOperator();
		t1.bitwiseoperator();

	}

}
