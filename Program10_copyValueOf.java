package StringPrograms;

public class Program10_copyValueOf {

	public static void main(String[] args) {
		/*
		 * S2.copyValueOf(s1.toCharArray(), 0, S1.length())
		 * S1.toCharArray() : S1 As Character Array
		 * 0                : Starting Index
		 * S1.length()      : No of character you need to pick up
		 * 
		 * we are trying to copy from index 0.
		 * And wish to copy s1.length() character. 
		 */
		
		String S1 = new String("Classroom");
		String S2 = new String();
		S2 = S2.copyValueOf(S1.toCharArray(), 0, S1.length());
		System.out.println(S2);
		S2 = S2.copyValueOf(S1.toCharArray(), 0, 5);
		System.out.println(S2);
		S2 = S2.copyValueOf(S1.toCharArray(), 5, 4);
		System.out.println(S2);
	}

}
