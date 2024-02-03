package StringPrograms;

public class Program27_join {

	public static void main(String[] args) {
		String s1 = new String("Snu, Mon, Wed, Thu, Fri, Sat");
		System.out.println(s1);
		String arr[] = s1.split(", ");
		/*
		 * After split,
		 * it will return array of strings.
		 */
		for(String x : arr) {
			System.out.println(x);
		}
		
		String n = String.join("- ", arr);
		/*
		 * 1st parameter : "Joining Character"
		 * 2nd parameter : "Array of string"
		 */
		System.out.println(n);

	}

}
