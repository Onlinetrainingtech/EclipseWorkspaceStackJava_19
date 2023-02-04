import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void writeData() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\v1.txt"))
		{
			int i;
			String name="welcome";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\v1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void copyData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\v1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\v2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((byte)i);
			}
			System.out.println("Data is copy..");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void readtwoData() throws IOException
	{
		try
		{
		FileInputStream fis1=new FileInputStream("D:\\v1.txt");
		FileInputStream fis2=new FileInputStream("D:\\v2.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int i;
		while((i=sis.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo t1=new Demo();
		//t1.writeData();
		//t1.readData();
		//t1.copyData();
		t1.readtwoData();

	}

}
