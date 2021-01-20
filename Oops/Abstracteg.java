package oops;

public class Abstracteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myobj = new Student();
		System.out.println("Name: "+myobj.fname);
		System.out.println("Age: "+myobj.age);
		System.out.println("Graduation Year: "+myobj.gradyear);
		myobj.study(); //call abstract method
	

	}

}
