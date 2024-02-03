package StringPrograms;

public class Program15_lastIndexOf {

	public static void main(String[] args) {
		String s1 = new String("Sat is day before Sun. Mon is day after Sun");
		String s2 = new String("Sun");
		System.out.println(s1.lastIndexOf(s2));
		//It will check right to left of the string s1
		//Sat is day before Sun. Mon is day after **Sun**
		
		System.out.println(s1.lastIndexOf(s2,0));
	   /* As here we started checking from 0 to left hand side,
	      then "Sun" is not present there, So it turns -1  
	    */
		
		System.out.println(s1.lastIndexOf(s2,25));
        //It will check from 25 to 0. "Sun" is present there ar 10 index.
	}

}
