package CollectionProgram;
import java.text.DateFormat.Field;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> num = new PriorityQueue<Integer>();
		num.add(10);
		num.add(20);
		num.add(1);
		
		System.out.println("Result : ");
		System.out.println(num);
		
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		System.out.println("\n"+num.size());
		System.out.println(num.isEmpty());
		
		System.out.println(num);
		num.clear();
		System.out.println(num);
		
		

	}

}
