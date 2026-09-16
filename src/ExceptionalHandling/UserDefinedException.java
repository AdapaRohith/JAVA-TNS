package ExceptionalHandling;

class InvalidAge extends Exception{
	InvalidAge(String message){
		super(message);
	}
}

public class UserDefinedException {
	
	public static void main(String[]args) {
		int age =15;
		try {
			if(age<18) {
				throw new InvalidAge("Age must be 18 or above");
			}
			System.out.println("You are eligible to vote");
		}catch(InvalidAge e) {
			System.out.println(e.getMessage());
		}
	}

}
