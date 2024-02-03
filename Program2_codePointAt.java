package StringPrograms;

public class Program2_codePointAt {

		/*
		 * codePountAt() :
		 * This method will help us to get the ascii character
		 * of a particular indexed character.
		 * 		 
		 */
	public static void main(String[] args) {
               String Str = "ABCabc";
               System.out.println(Str.charAt(0)+ " " + Str.codePointAt(0));
               System.out.println(Str.charAt(3)+ " " + Str.codePointAt(3));
	}

}
