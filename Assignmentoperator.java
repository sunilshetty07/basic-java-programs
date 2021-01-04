package basics;

public class Assignmentoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("Assignment id done: "+x);
		
		//+=
		x+=3; //x=x+3
		System.out.println(x);
		x-=3; //x=x-3
		System.out.println(x);
		
		x*=3; //x=x*3
		System.out.println(x);
		
		x/=3; //x=x/3
		System.out.println(x);
		
		x%=3; //x=x%3
		System.out.println(x);
		
		x&=3; //x=x&3
		System.out.println(x);
		
		x|=3; //x=x|3
		System.out.println(x);
		
		x^=3; //x=x^3
		System.out.println(x);
		
		x>>=3; //x=x>>3
		System.out.println(x);
		
		x<<=3; //x=x<<3
		System.out.println(x);
	}

}
