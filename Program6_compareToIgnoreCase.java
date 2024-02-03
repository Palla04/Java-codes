package StringPrograms;

public class Program6_compareToIgnoreCase {
	/*
	 * compareToIgnoreCase() :
	 * In this scenario,
	 * it does not matter of the cases for both the string.
	 * 
	 * 0: both are equal
	 * pos : Ascii of 1st mismatched character b/w 2string, 1st one is greater
	 * neg : Ascii of 1st mismatched character b/w 2string, 2nd one is greater
	 */

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("ABC");
		
		System.out.println(s1.compareTo(s2));//Ascii(a)97 - Ascii(A)65 = 32
		System.out.println(s1.compareToIgnoreCase(s2));
		//ignore case:
		//so,  Ascii(A/a) - Ascii(A/a) = 0

	}

}
