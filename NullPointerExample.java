package ExceptionHandling;

public class NullPointerExample {

	public static void main(String[] args) {
		
		//we can write try with Finally only
		try {
			String s = "Hello";
			System.out.println(s.length());
		}
		finally {
			System.out.println("Finally Block\n");
		}
		
		
		
		//we can write try with catch only
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			//System.out.println(e);
			System.out.println("String can not be null here.");
		}
		
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			//System.out.println(e);
			System.out.println("String can not be null here.");
		}
		
		finally {
			System.out.println("Finally Block\n");
		}

	}

}
