package ArrayPrograms;

public class ArrayProgram1 {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		//Process 1
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
		//How to print array element way 1
		
		System.out.println("Array size: "+array.length);
		for(int value=0;value<array.length;value++)
		{
			System.out.print(value +" ");
			System.out.println(array[value]);	
		}
		
		//way-2
		for (int element:array)
		{
			System.out.println(element);
		}
		/*
		 * Difference between way 1 and 2
		 * 
		 * in way 1,
		 * we can access:
		 * 1. array[value] :: Element that means value present at index
		 * ex: array[1] :: value at index 1 : 20
		 * 
		 * in way 2
		 *we can access
		 *value only,we can not access index
		 *
		 *so in way 2 we can not modify array element.
		 *it is possible in way 1
		 *
		 */
		for(int value=0;value<array.length;value++){
			array[value] += 1;//modification
		}
		for(int value=0;value<array.length;value++)
		{
			System.out.println(array[value]);	
		}
		
        
	}

}
