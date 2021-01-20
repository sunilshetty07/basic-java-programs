package oops;

//it is a special method that is used to initialize objects
public class Javaconstructor {
	int x; //class attribute
	int y;
	int modelyear;
	String modelname;
	
	//create class constructor for the Java constructor class
	public Javaconstructor()
	{
		x=5; //set the initial value of class attribute x
	}

	//constructor parameters
	public Javaconstructor(int z)
	{
		y=z;
	}
	public Javaconstructor(int year,String name)
	{
		modelyear=year;
		modelname=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javaconstructor myobj = new Javaconstructor();
		System.out.println(myobj.x);
		
		Javaconstructor myobj1=new Javaconstructor(10);
		System.out.println(myobj1.y);
		
		Javaconstructor myobj2 = new Javaconstructor(2012,"Toyota Fortuner");
		System.out.println("The car "+myobj2.modelname+" released in "+myobj2.modelyear);
	}

}
