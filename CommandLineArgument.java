package Introduction;

public class CommandLineArgument {
	public static void main(String[] args) {
		
		Integer x = Integer.parseInt(args[0]);
		System.out.println(x+20);
		System.out.println(args[0]+20);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
	}

}
