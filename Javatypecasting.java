package basics;

public class Javatypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//there are 2 types casting
		//1-> widening casting(automatic) convert smaller type to larger type
		int myint=15;
		double mydouble=myint;
		
		System.out.println(myint); //output: 15
		System.out.println(mydouble); //output: 15.0
        
		//2->narrowing casting: it is done manually by placing the type in parentheses in front of the value
		double mydouble1=15.78;
		int myint1=(int)mydouble1;
		
		System.out.println(mydouble1); //output: 15.78
		System.out.println(myint1); //output: 15
		
	}

}
