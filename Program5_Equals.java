package StringPrograms;

public class Program5_Equals {

	public static void main(String[] args) {
		/*
		 * when == operator works b/w 2 strings,
		 * they will check both the strings have the same reference or not.
		 * If yes, then returns true
		 * Else,it returns false
		 */
		
		String s1 = new String("JAVA");
		String s2 = new String("Python");
		String s3 = s1;//Alias name of s1 is s3 or vice versa
		String s4 = new String("JAVA");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
	}

}
