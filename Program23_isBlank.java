package StringPrograms;

public class Program23_isBlank {

	public static void main(String[] args) {
		String s1 = new String("   ");
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		
		/*
		      isEmpty()  :
		                   If String.length() == 0 : isEmpty() returns true.
		                   If String.length() > 0  : isEmpty() returns false
		                   
		      isBlank()  :
		                   If whole String contains 0 character or all white character,
		                    then it will return true.
		                   Else it will return false.
		 */

	}

}
