package Inheritance;

public class hierarichal {
	String name = "Rohith";
	String TnsId = "T160600402";
	String CollegeId = "23M91A0503";
}

class Tns extends hierarichal{
	
	public void TnsDetails() {
		System.out.println("The Tns Details of "+name +
				"\nStudent Name : " + name + 
				"T\nNSID : "+ TnsId);
	}
	
}
class Aurora extends hierarichal{
	public void CollegerDetails() {
		System.out.println("The College Details of "+name +
				"\nStudent Name : "+ name +
				"\nCollegeID: "+CollegeId);
	}
}