package StringPrograms;

public class Program31_subsequence {

	public static void main(String[] args) {
		String S1 = "Classroom";
		System.out.println(S1.subSequence(0,5));
		
		/*
		 * String_object.subSequence(Start,End+1);
		 * 
		 * Classroom
		 * 012345678
		 * 
		 * S1.subSequence(0,5)
		 * 
		 * (String) S1.subSequence(0,5): Now we are implicit type casting
		 * from Character sequence to String
		 * 
		 */
		System.out.println(S1.subSequence(5,9));

		String s2 = (String) S1.subSequence(0,5);
		System.out.println(s2);
	}

}
