package StringPrograms;

public class Program22_stripTrailing {

	public static void main(String[] args) {
		String s1 = new String("    Hello    ");
		System.out.println(s1);
		
		String s2 = s1.stripTrailing();
		//It will remove only the Trailing space
		
		
		System.out.print("--");
		System.out.print(s2);
		System.out.print("--");

	}

}
