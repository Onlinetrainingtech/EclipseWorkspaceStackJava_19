
public class Sample1 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Welcome");
		System.out.println(""+sb.append("hai"));
		System.out.println(""+sb.insert(0,"welcome"));
		System.out.println(""+sb.substring(1, 5));
		System.out.println(""+sb.delete(3, 7));

	}

}
