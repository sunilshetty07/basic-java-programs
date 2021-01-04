package basics;
import java.util.*;
public class Javaoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // + operator
		int x=5;
		int y=10;
		int res=x+y;
		System.out.println("Result is "+res);
		
		int sum1=100+50;
		int sum2=sum1+100;
		int sum3=sum1+sum2;
		System.out.println("sum1 "+sum1);
		System.out.println("sum2 "+sum2);
		System.out.println("sum3 "+sum3);
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Arithmetic operators: ");
		System.out.println("________________________________________");
		System.out.println("Enter two numbers: ");
	    int a=in.nextInt();
	    int b=in.nextInt();
	    
	    int result;
		System.out.println("1-> Addition\n2->Subtraction\n3->Multiplication\n4->Division\n5->Modulus\n6->Increment\n7->Decrement");
		System.out.println("Enter Your Choice: ");
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:result=a+b;
		       System.out.println("Addition result is: "+result);
		       break;
		case 2:result=a-b;
	           System.out.println("Subtraction result is: "+result);
	           break;
		case 3:result=a*b;
	           System.out.println("Multiplication result is: "+result);
	           break;
		case 4:if(b==0)
		       {
			       System.out.println("Result of division is:"+0); 
		       }
		       else
		       {
			       float div=(float)a/b;
	               System.out.println("Division result is: "+div);
		       }
		       break;
			
		case 5:result=a%b;
               System.out.println("Modulus result is: "+result);
               break;
		case 6:result=++a;
		       int res1=++b;
               System.out.println("Increment of a is: "+result+" Increment of b is "+res1);
               break;
		case 7:result=--a;
	           int res2=--b;
               System.out.println("Increment of a is: "+result+" Increment of b is "+res2);
               break;
		default:
			System.out.println("Incorect choice");
			
		}
		in.close();//otherwise you get warning as resource leak
		
	}

}
