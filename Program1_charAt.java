package StringPrograms;

public class Program1_charAt {

	public static void main(String[] args) {
		String Str = "JAVA Program";
		/*
		 * JAVA program
		 * 012345678901
		 * 
		 */
		System.out.println(Str);
		System.out.println("5th character : "+Str.charAt(5));
		
		System.out.println("The length of the string "+Str.length());
		System.out.println();
		/* Print ALL the characters of a string */
		
		for(int index = 0; index<Str.length(); index++)
		{
			System.out.println(Str.charAt(index));
		}

	}

}
