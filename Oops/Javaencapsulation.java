package oops;

public class Javaencapsulation {
//encapsulation: hide sensitive data from users
/* declare class variable as private
 * use get and set method to access and update private variable
 */
	private String name;
	private int num;
	
	public int getNum()
	{
		return num;
	}
	
	public void setNum(int newnum)
	{
		this.num=newnum;
	}
	//Get
	public String getname() {
		return name;
	}
	
	//set
	public void setname(String newName)
	{
		this.name=newName;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
