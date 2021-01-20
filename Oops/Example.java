package oops;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javamodifierprivate myobj=new Javamodifierprivate();
		//System.out.println(myobj.age); 
		//shows error because age is only accessible in Javamodifierprivate class only
		//it can't be accessible on different class
		
		Javamodifierprotected my= new Javamodifierprotected(); 
		System.out.println(my.fname);  //protected can be accessed in same package,subclass,super class
		
		//program for Javaencapsulation.java
		Javaencapsulation obj = new Javaencapsulation();
		obj.setname("Sunil Shetty");
		System.out.println(obj.getname());
		obj.setNum(40);
		System.out.println(obj.getNum());

	}

}
