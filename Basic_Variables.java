package basics;
public class Basic_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*syntax:
		 type variable = value;
		 */
		//1
		String name;
		name="John";
		System.out.println("1->"+name);
		
		//2
		int mynum=15;
		System.out.println("2-> "+mynum);
		
		//3
		int Mynum=15;
		Mynum=20;
		System.out.println("3-> "+Mynum);
		
		//4
		float num=0.99f;
		System.out.println("4-> "+num);
		
		//5
		char letter='d';
		System.out.println("5-> "+letter);
		
		//6
		boolean val=true;
		System.out.println("6-> "+val);
		
		
	    //7
		String fName="Jhon";
		String lName="Doe";
		String fullName=fName+lName;
		System.out.println("7-> "+fullName);
		
		//8
		int x=5;
		int y=7;
		System.out.println("8th output");
		System.out.println(x+y);
		System.out.println("8-> "+x+y);
		//9
		int a=5,b=8,c=3;
		System.out.println("9th output");
		System.out.println(a+b+c);
		System.out.println("9-> "+a+b+c);
		
		//data types
		//primitive data types
		System.out.println("________________________________________________________");
		System.out.println("Data Types:");
		
		System.out.println("for whole numbers: byte,short,int,long: ");
		
		byte Num=100;
		System.out.println(Num);
		
		short num1=5000;
		System.out.println(num1);
		
		
		int num2=10000;
		System.out.println(num2);
		
		long num3=100000000000000L;
		System.out.println(num3);
		
		System.out.println("________________________________________________________");

		
		System.out.println("for floating point number:");
		
		float fnum=0.99F;
		System.out.println(fnum);
		
		double dnum=19.99d;
		System.out.println(dnum);
		
		System.out.println("________________________________________________________");

		
		System.out.println("For Scientific numbers: ");
		float f1 = 35e3f;
		double d1 = 12E4d;
		
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println("________________________________________________________");
        
		System.out.println("boolean values: ");
		boolean isJavaFun=true;
		boolean isFishTasty=false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		
		System.out.println("________________________________________________________");

		System.out.println("Non primitive data types: String,Class,Array,Interface etc ");
		String name1="Sunil";
		System.out.println(name1);
	}

}
