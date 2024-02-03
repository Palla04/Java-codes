package CollectionProgram;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		//To see the whole content of the ArrayList days
		System.out.println(days);
		
		//To see the whole content of the ArrayList days using loops
		for(String s: days) {
			System.out.println(s);
		}
		
		//Remove element using value - First Occurrence Value will be removed
		/*
		 * General Syntax:
		 * ArrayList.remove(value/Index)
		 */
		
		System.out.println(days.size());//days.length == days.size()
		System.out.println(days.get(0));//days[0] == days.get(0);
		/*
		 * Array:
		 * Find out length : arr.length();
		 * element access through index : arr[index];
		 * 
		 * ArrayList:
		 * Find out length : arrayList.size();
		 * element access through index : arrayList.get(0);
		 */
		days.remove("Monday");
		System.out.println(days);
		
		//Remove element using index
		days.remove(3);
		System.out.println(days);
		
		//Add element
		days.add(1,"Monday");
		days.add(4,"Thursday");
		System.out.println(days);
		
		//Total element
		System.out.println("Total Elements : "+days.size());
		/*
		 * for(int i=0; i<arr.length; i++){
		 *     System.out.println(arr[i]);
		 *  }
		 */
		for(int i=0; i<days.size(); i++){
			    System.out.println(days.get(i));
	     }
		
		
		
	}

}
