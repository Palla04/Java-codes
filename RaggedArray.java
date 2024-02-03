package ArrayPrograms;

import java.util.Scanner;

public class RaggedArray {

	public static void main(String[] args) {
		int array[][]=new int [3][];
		/*
		 * in this case we are not mention the number of columns.
		 * then,
		 * Each row may contain different number of cols.
		 */
        Scanner sc = new Scanner(System.in);
		
		for(int row=0;row<array.length;row++)
		{
			System.out.print("Enter number of cols: ");
			int cols=sc.nextInt();
			
			array[row] = new int[cols];
			/* Extra added for Ragger array */
			for(int col=0;col<cols;col++)
			{
				System.out.print("Enter a value: ");
				array[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.print(array[row][col]+ " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
