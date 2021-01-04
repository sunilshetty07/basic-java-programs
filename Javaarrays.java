package basics;

public class Javaarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars= {"Volvo","BMW","TATA","Audi"};
		int[] myNum= {10,20,30,40,50};//Array of integers
		
		//accessing elements of an array
		
		System.out.println(cars[0]);
		System.out.println(myNum[myNum.length-1]);
		
		//changing array element
		cars[0]="Maruti";
		System.out.println(cars[0]);
		
		//length of array
		System.out.println("array length of myNum: "+myNum.length);
		
		//loops through an array
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		System.out.println("___________________");
		
		//loop through an array with for each
		for(int i:myNum)
		{
			System.out.println(i);
		}
		System.out.println("___________________");
		//declaring array without any values
		int[] myNumbers = new int[5];
		for(int i=0;i<myNumbers.length;i++)
		{
			System.out.println(myNumbers[i]);
		}
		System.out.println("___________________");
		//adding value to an array
		int[] myNumbers1 = new int[5];
		
		myNumbers1[0]=100;
		myNumbers1[1]=200;
		myNumbers1[2]=300;
		myNumbers1[3]=400;
		myNumbers1[4]=500;
				
		for(int i=0;i<myNumbers1.length;i++)
		{
			System.out.println(myNumbers1[i]);
		}
		System.out.println("___________________");

	}

}
