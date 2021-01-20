package oops;

public class Javanonaccessmodifierfinal {
//if attribute contain final it cannot be over written
	final int x=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javanonaccessmodifierfinal my = new Javanonaccessmodifierfinal();
		//my.x=20; //generate error cannot assign value to  final variable
		System.out.println(my.x);
		
	}

}
