package CollectionProgram;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		LinkedList<String> Queue = new LinkedList<String>();
		/*
		      What is Queue?
		         Queue is a Data structure that follows FIFO method.
		         It means "First In First Out"
		         Operations
		         1. Insert  : Add element at the end of Queue.
		         2. Delete  : Remove element from the First of the Queue.
		         3. Display : Print the all element in a Queue.
		 */
		while(true) {
			System.out.println("1. Insert 2. Delete 3.Display");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Choice : ");
			int Choice = scan.nextInt();
			
			switch(Choice)
			{
			case 1:
				System.out.println("Enter a string as input : ");
				String val = scan.next();
				Queue.addLast(val);
				break;
			case 2:
				System.out.println("Delete() : "+Queue.removeFirst());
				break;
			case 3:
				System.out.println("Display() : "+Queue);
				break;
			case 4:
				System.exit(0);
				break;
			
			}
		}
		

	}

}
