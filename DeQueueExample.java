package CollectionProgram;
import java.util.*;
public class DeQueueExample {

	public static void main(String[] args) {
		/*
		      *What is DeQueue?
		         DeQueue stands for Double Ended Queue,
		         that means element can be deleted from both the end.
		         
		        *Operation
		         1. Insert_first : Add an element at the First of Queue.
		         2. Insert_last  : Add an element at the End of Queue.
		         3. Delete_first : Remove an element from the first of the Queue.
		         4. Delete_last  : Remove an element from the end of the Queue.
		         6. Display      : Print all elements of a Queue.
		         
		        *Input Restricted DeQueue
		         1. Insert_last  : Add an element at the End of Queue.
		         2. Delete_first : Remove an element from the first of the Queue.
		         3. Delete_last  : Remove an element from the last of the Queue.
		         4. Display      : Print all elements of a Queue.
		         
		        *Output Restricted DeQueue
		         1. Insert_first : Add an element at the First of Queue.
		         2. Insert_last  : Add an element at the End of Queue.
		         3. Delete_first : Remove an element from the first of the Queue.
                 4. Display      : Print all elements of a Queue.
		 */
		LinkedList <String> Queue = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Queue : ");
		int maxsize = sc.nextInt();
		
		System.out.println("The size of Queue : "+maxsize);
		
		while(true) {
			System.out.println("1. Insert_last 2. Delete_first 3. Insert_first 4. Delete_last 5.Display 6.Exit");
			System.out.println("Enter the choice :");
			int Choice = sc.nextInt();
			
			switch(Choice) {
			    case 1:
			    	if(Queue.size()==maxsize)
			    	{
			    		System.out.println("Queue is Full");
			    	}
			    	else
			    	{
			    		System.out.println("Enter the number to be insert :");
			    		String val = sc.next();
			    		Queue.addLast(val);
			    	}
			    	break;
			    	
			    case 2 :
			    	if(Queue.size()==0)
			    	{
			    		System.out.println("Queue is Empty");
			    	}
			    	else
			    	{
			    		System.out.println("Delete() : "+Queue.removeFirst());   		
			    	}
			    	break;
			    
			    case 3:
			    	if(Queue.size()==maxsize){
			    		System.out.println("Queue is Full");
			    	}
			    	else
			    	{
			    		System.out.println("Enter the number to be insert :");
			    		String val = sc.next();
			    		Queue.addFirst(val);
			    	}
			    	break;
			    	
			    case 4:
			    	if(Queue.size()==0)
			    	{
			    		System.out.println("Queue is Empty");
			    	}
			    	else
			    	{
			    		System.out.println("Delete() : "+Queue.removeLast());   		
			    	}
			    	break;
			    	
			    case 5:
			    	System.out.println(Queue);
			    	break;
			    	
			    case 6:
			    	System.exit(0);
			    	break;
			    	
			    	
			}
		}

	}

}
