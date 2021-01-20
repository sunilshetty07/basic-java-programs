package oops;

class Javainheritance1 {
	protected String brand = "Ford";
	public void horn() {
		System.out.println("ponk ponk:)");
	}
}

class Auto extends Javainheritance1{
	private String modelName="Freestyle";
	 
    public static void main(String[]args) {
    	Auto a = new Auto();
    	a.horn();
    	
    	System.out.println(a.brand+" "+a.modelName);
    }
}