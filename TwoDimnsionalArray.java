package ArrayPrograms;

import java.util.Scanner;

public class TwoDimnsionalArray {

	public static void main(String[] args) {
		/*
		 * process 1
		 */
		int arr[][]= {{10,20,30},{40,50,60}};
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.println(arr[row][col]);
			}
		}
		/*
		 * arr.length= total no pf rows
		 * arr[row].length = total no of cols in that row
		 */
		
		/* process 2 */
		int array[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print("Enter a value: ");
				array[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(array[row][col]+ " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
