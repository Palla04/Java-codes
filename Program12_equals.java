package StringPrograms;

      /*
       * equals() : checks content
       * ==       : checks reference equality
       */
public class Program12_equals {

	public static void main(String[] args) {
		String S1 = new String("Classroom");
		String S2 = new String("Classroom");
		String S3=S1;
		/*
		 * Here,
		 *     S3 and S1 both points same memory allocation.
		 *     so, S1 and S3 are alias to each other.
		 */
		System.out.println(S1.equals(S2));
		System.out.println(S1.equals(S3));
		System.out.println(S1==S2);
		//Both content same but memory allocation different
		
		System.out.println(S1==S3);
		//S3 and S1 both content same and points same memory allocation.
		

	}

}
