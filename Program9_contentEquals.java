package StringPrograms;

public class Program9_contentEquals {

	public static void main(String[] args) {
		String s1 = new String("Classroom");
		String s2 = new String("Classroom");
		String s3 = new String("room");
		String s4 = new String("ClassRoom");
		String s5 = s1;
		
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.contentEquals(s3));
		
		System.out.println(s1.contentEquals(s4));
		System.out.println(s1.contentEquals(s5));
		System.out.println(s1==s5);
		
	}

}
