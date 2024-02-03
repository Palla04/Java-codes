package CollectionProgram;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		LinkedList<Integer> Stack = new LinkedList<Integer>();
		
		/*
		      What is Stack?
		         Stack is a Data Structure that follows LIFO concept.
		         that means "Last In First Out"
		         Operation
		         1. Push    : At a element at the top of the stack
		         2. Pop     : Remove element from the top of the stack
		         3. Peek    : Return the last(Top) element of the stack
		         4. Display : Print all element in a stack
		 */
		
		//1. Push
		Stack.addLast(10);
		Stack.addLast(20);
		Stack.addLast(30);
		Stack.addLast(40);
		Stack.addLast(50);
		
		//Print the Stack
		System.out.println("The Elements of the Stack : "+Stack);
		
		//2. Pop Operation
		System.out.println("Pop() : "+Stack.removeLast());
		System.out.println("Pop() : "+Stack.removeLast());
		System.out.println("Now Elements of the Stack : "+Stack);
		
		//3. Peek
		System.out.println("Peek() : "+Stack.peekLast());
		
		//4. Display
		System.out.println("Display() : "+Stack);
		

	}

}
