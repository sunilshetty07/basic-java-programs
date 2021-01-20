package oops;

public class Javamodifierprivate {
	private String fname = "Sunil";
	private String lname = "Shetty";
	private String email="sunilsshetty07@gmail.com";
	private int age =22;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javamodifierprivate myobj = new Javamodifierprivate();
		System.out.println("Name: "+myobj.fname+" "+myobj.lname);
		System.out.println("Email: "+myobj.email);
		System.out.println("Age: "+myobj.age);
	}

}
