package basics;

public class Javastrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting="Hello";
		System.out.println(greeting);
		
		//String methods
		//1) length()
		
		String txt = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("The length of txt string is: "+txt.length());
		
		//2) toLowerCase()
		String txt1="Hello World!";
		System.out.println(txt1.toLowerCase());
		
		//3) toUpperCase()
		System.out.println(txt1.toUpperCase());
		
		//4) indexOf()
		String txt2="my name is sunil";
		System.out.println(txt2.indexOf('s'));
		System.out.println(txt2.indexOf("sunil"));
		
		String txt3="my name is sunil 'sunil' occurs at";
		System.out.println(txt3.indexOf("sunil"));
		
		//5) String Concatenation
		String fname="sunil";
		String lname="shetty";
		System.out.println(fname+" "+lname);
		
		System.out.println(fname.concat(lname));
		
		// 6) special character
		
		String txt4="my name is \"sunil\" shetty";
		String txt5="my name is \'sunil\' shetty";
		String txt6="my name is \\sunil\\ shetty";
		System.out.println(txt4);
		System.out.println(txt5);
		System.out.println(txt6);
		
		String txt7="hello \nmy name \rsunil shetty\t how\bare\byou\nnamasthe\f";
		System.out.println(txt7);
		
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
		
		String x1="10";
		String y1="20";
		String z1=x1+y1;
		System.out.println(z1);

	}

}
