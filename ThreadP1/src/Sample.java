class Demo extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("ThreadIN");
		Thread.sleep(10000);
		System.out.println("This is thread-0 process"+Thread.currentThread().getName());
		System.out.println("Get the Priority::"+Thread.currentThread().getPriority());
		System.out.println("ThreadOUT");
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo t1=new Demo();//creating a thread
		Demo t2=new Demo();
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t1.isInterrupted());

	}

}
