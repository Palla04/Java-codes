package StringPrograms;

public class Problem30_StringRemove {

	public static void main(String[] args) {
		String s1 = new String("Today is Saturday");
		s1 = s1.replace("is ", "");
		/*
		 * General Syntax:
		 * String-replace("What to replace","By which String");
		 */
		System.out.println(s1);
		
		s1 = s1.replace("is ", "").replace("Saturday","Sunday");
		System.out.println(s1);
		
	    s1 = new String("Today is Saturday Saturday");
		s1 = s1.replace("is ", "").replace("Saturday","Sunday");
		System.out.println(s1);
	}

}
