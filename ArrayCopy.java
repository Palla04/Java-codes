package ArrayPrograms;

public class ArrayCopy {

	public static void main(String[] args) {
		int source[]= {1,2,3,4,5,6};
		int dest[] = new int[10];
		System.arraycopy(source,  0, dest, 4, source.length);
		/*
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 * Parameters:
		 * src: the source array.
		 * srcPos: Starting position in the source array.
		 * dest: the destination array.
		 * destPos: starting position in the destination data.
		 * length: the number of array elements to be copied
		 */
		
		for(int value : source)
			System.out.print(value+ " ");
		System.out.println();
		
		for(int value : dest)
			System.out.print(value+" ");
		
		int dest1[] = new int[10];
		System.arraycopy(source, 0, dest1, 2, 4);
		
		System.out.println();
		for(int value : dest1)
			System.out.print(value+" ");
	}

}
