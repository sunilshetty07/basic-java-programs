package oops;

class Veichle {
	protected String brand="BMW";
	public void horn1()
	{
		System.out.println("Ponk ponk");
	}
}
	class auto1 extends Veichle
	{
	public static void main(String[]args)
	{
		auto1 v = new auto1();
		v.horn1();
	}
}
