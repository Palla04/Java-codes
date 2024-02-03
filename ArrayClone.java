package ArrayPrograms;

public class ArrayClone {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]=new int[10];
		for(int element : arr1)
		{
			System.out.print(element+" ");
			
		}
		System.out.println();
		arr2 = arr1.clone();
		/*
		 * if we create clone of one dimensional array in java,
		 * then it will follow deep copy of that array within another one.
		 */
		
		for(int element : arr2)
		{
			System.out.print(element+" ");
		}

		arr1[0]=15;
		System.out.println("\narr1 : ");
		for(int element : arr1) {
			System.out.print(element+" ");
		}
		
		System.out.println("\narr2 : ");
		for(int element : arr1) {
			System.out.print(element+" ");
		}
	}

}
