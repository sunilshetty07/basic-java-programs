package oops;

public class Staticpublicmethods {
	static void myStaticmethod()
	{
		System.out.println("Static method can be called without creating objects");
	}
	public void myPublicMethod()
	{
		System.out.println("Public method must be called by creating objects");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStaticmethod(); //calling static method
		
		//calling public method
		Staticpublicmethods myobj = new Staticpublicmethods();
		myobj.myPublicMethod();
	}

}
