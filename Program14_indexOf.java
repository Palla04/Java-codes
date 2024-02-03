package StringPrograms;

public class Program14_indexOf {

	public static void main(String[] args) {
		String s1 = new String("Tomorrow is Christmas.");
		String s2 = new String("Christ");
		String s3 = new String("Day");
		
		System.out.println(s1.indexOf(s2));
		/*
		 *    Here s1 contains a String : Tomorrow is Christmas.
		 *    Here s1 contains a String : Christ
		 *    
		 *    s1.indexOf(s2)  =>  s1.indexOf(s2,0)
		 *    
		 *    Christ this word is present on 12th index of 1st string from the beginning.
		 *    so, Output is 12
		 *    
		 *    Return type of s1.indexOf(s2) --> int
		 */
		System.out.println(s1.indexOf(s3));
		//if not present the 2nd string in the 1st string
		
		String s4 = new String("Sat is day before Sun. Mon is day after Sun");
		String s5 = new String("Sun");
		System.out.println(s4.indexOf(s5,25));
		/*
		         s4.indexOf(s5,25)
		         This method will find s5 from 25th character of s4 string.
		         so, here "Sun" word is repeted twise
		         so, After 25th index Sun is present at 40th index.
		         Then the output is 40.    
		 */
		System.out.println(("Hello").indexOf("Bye"));

	}

}
