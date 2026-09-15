package ExceptionalHandling;

public class TryCatchExample {
	public static void main(String[]args) {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			
			
			System.out.println(e);
			System.out.println("Cannot divide with 0");
			
		}
	}

}
