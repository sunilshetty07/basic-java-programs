package basics;

public class Bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Btwise And operator:");
		System.out.println(5&1);
		/*
		 * 5-> 0101
		 * 1-> 0001
		 * 5&1->0001
		 * 0001->1
		 */
		
		System.out.println("Btwise or operator:");
		System.out.println(5|1);
		/*
		 * 5-> 0101
		 * 1-> 0001
		 * 5&1->0101
		 * 0001->5
		 */
		
		System.out.println("Btwise Not operator:");
		System.out.println(~5);
		/*
		 * 5-> 0101
		 * ~5-> 1010
		 * 1010->10(32 bit operation -> -6)
		 * 5->00000000000000000000000000000101
		 * ~5->11111111111111111111111111111010->-6
		 */

		System.out.println("Btwise XOR operator:");
		System.out.println(5^1);
		/*
		 * 5-> 0101
		 * 1-> 0001
		 * 5&1->0100
		 * 0100->4
		 */
		
		System.out.println("Btwise Zero fill Left shift operator:");
		System.out.println(9<<1);
		/*
		 * 9-> 1001
		 * 9<<1->0010  remove leftmost bit(0) add 0 to right most end
		 * 0001->2
		 */
		
		System.out.println("Btwise signed Right shift operator:");
		System.out.println(9>>1);
		/*
		 * 9-> 1001
		 * 1-> 0001
		 * 9>>1->1100 remove right most bit i.e 1 add left most side by copies of last left most bit i.e 1
		 * 1100->12(not written 12) in java it is do 32 bit operation
		 * 00000000000000000000000000001001>>00000000000000000000000000000001
		 * 00000000000000000000000000000100->4
		 */
		
		System.out.println("Btwise Zero fill right shift operator:");
		System.out.println(9>>>1);
		/*
		 * 9-> 1001
		 * 1-> 0001
		 * 9>>>1->0100
		 * 0100->4
		 */
	}

}
