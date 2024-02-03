package StringPrograms;

public class Program4_compareTo {
	/*
	 * compareTo() :
	 * Ascii(1st Mismatched Character in string1)-
	 * Ascii(1st Mismatched character in string2) <=> Neg,0,Pos
	 * 
	 * 0 <=> Both are equal String.
	 */

	public static void main(String[] args) {
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		String s3 = "Python";
		String s4 = "JBple";
		String s5 = s1;
		
		System.out.println(s1.codePointAt(0));
		System.out.println(s3.codePointAt(0));
		
		System.out.println(s1.compareTo(s2));
		/*
		 * As there is no difference between s1 and s2 then,
		 * Ascii difference of all the character also will be 0.
		 */
		
		System.out.println(s1.compareTo(s3));
		//Ascii(J) - Ascii(P) = 74-80 =-6
		System.out.println(s1.compareTo(s4));
		//Ascii(A) - Ascii(B) = 65-66 = -1
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s1));

	}

}
