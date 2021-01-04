package basics;

public class Javabreakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break:jump out of loop
		for(int i=0;i<10;i++)
		{
			if(i==4)
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("____________________________");
		System.out.println("example for continue:");
		System.out.println("____________________________");
		for(int i=0;i<10;i++)
		{
			if(i==4)
			{
				continue; //when i=4 it the control goes to for loop without executing print statement
			}
			System.out.println(i);
		}
		
		System.out.println("______________________________");
		System.out.println("example of braek and continue in while loop:");
		System.out.println("_______________________________");
		
		int i=0;
		while(i<10)
		{
			System.out.println(i);
			i++;
			if(i==4)
			{
				break;
			}
		}
		System.out.println("_______________________________");
		int j=0;
		while(j<10)
		{
			if(j==4)
			{
				j++;
				continue;
			}
			System.out.println(j);
			j++;
			
		}
		System.out.println("_______________________________");
		int k=0;
		while(k<10)
		{
			System.out.println(k);
			k++;
			if(k==4)
			{
				k++;
				continue;
			}
			
			
		}

	}

}
