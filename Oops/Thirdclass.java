package oops;

public class Thirdclass {
		int z=10,a;
		public static void main(String[]args) {
			Thirdclass obj=new Thirdclass();
			System.out.println(obj.z); //accessing attributes using dot(.)
			Oneclass obj1=new Oneclass();
			System.out.println(obj1.y);
			
			//modifying attributes
			obj.a=42;
			System.out.println(obj.a);
			
			//override existing attribute
			obj.z=50;
			System.out.println(obj.z);
			
			obj1.y=25;
			System.out.println(obj1.y);
			
			//multiple objects
			Thirdclass obj5=new Thirdclass();
			System.out.println(obj5.z);
			
			Thirdclass myobj= new Thirdclass();
			myobj.z=44;
			System.out.println(myobj.z);
		}
}
