package basics;

public class Javamultidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mynum= {{1,2,3},{4,5,6},{7,8,9},{10}};
		             //{0{0,1,2},1{0,1,2},2{0,1,2},3{0}}
		int x=mynum[1][2];
		int y=mynum[3][0];
		System.out.println(x);
		System.out.println(y);
	
		System.out.println("____________________");
		System.out.println("Accessing multidimensional array using for loop:");
		for(int i=0;i<mynum.length;i++)
		{
			for(int j=0;j<mynum[i].length;j++)
			{
				System.out.println(mynum[i][j]);
			}
		}
	}

}
