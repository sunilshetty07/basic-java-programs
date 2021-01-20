package oops;

public class Car {
	public void fullThrottle()
	{
		System.out.println("The car is going fast as it can");
	}
	
	public void Speed(int maxspeed)
	{
		System.out.println("Max speed is "+maxspeed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.fullThrottle();
		mycar.Speed(100);
	}

}
