package oops;

abstract class person1 { //abstract class
	public String fname="Sunil";
	public int age = 22;
	
	public abstract void study(); //abstract method
}

//subclass inherit from person1
class Student extends person1{
	public int gradyear=2020;
	public void study() {//body provided here
		System.out.println("Studying all day long");
	}
}
