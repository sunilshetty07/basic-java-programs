package basics;
import java.util.*;
public class Javaifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if
		if(10>5)
		{
			System.out.println("10 is greater than 5");
		}
		
		//if-else
		int time=20;
		if(time<18)
		{
		System.out.println("Good Day");
		}
		else
		{
			System.out.println("good evening");
		}
		
		//else if statement
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter time");
		int time1=in.nextInt();
		if(time1<10)
		{
			System.out.println("Good Morning");
		}
		else if(time1<20)
		{
			System.out.println("Good Day");
		}
		else
		{
			System.out.println("Good Evening");
		}
		
		//short hand if else
		//ternary operator
		String result=(time1<18)?"Good Day":"Good Evening";
		System.out.println(result);
		in.close();
	}

}
