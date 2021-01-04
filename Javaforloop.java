package basics;

public class Javaforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		for(int i=0;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		/*for each loop
		*used for loops through elements in an array
		*Syntax:
		*for(type variableName:array Name)
		*{
		*statements
		*}
		*/
		String[] cars= {"volvo","BMW","Ford","Audi","TATA"};
		System.out.println(cars.length);
		for(String i:cars)
		{
			System.out.println(i);
		}
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}

	}

}
