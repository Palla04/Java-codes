package CollectionProgram;
import java.util.*;
public class ArraydequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<String>();
		adq.push("A");
		adq.push("B");
		adq.push("C");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println("Pop the Stack : ");
		while(adq.peek()!=null) {
			System.out.println(adq.pop());
		}
		System.out.println(adq.peek());
		System.out.println(adq);

	}

}
