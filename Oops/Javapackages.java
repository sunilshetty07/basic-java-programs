package oops;

import java.util.Scanner;
public class Javapackages {
/*two types:
 * 1) built in
 * 2) user defined
 */
	//built in packages:- Syntax: import package.name.Class; for importing single class
	//import package.name.*; import the whole package
	/*example: import java.util.Scanner; import a single class
	import java.util.*; importing whole package
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter User Name: ");
		String name=in.nextLine();
		System.out.println("Entered name is: "+name);
		in.close();

	}

}
