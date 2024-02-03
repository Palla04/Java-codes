package ArrayPrograms;

import java.util.Scanner;
public class ArrayProgram2 {

	public static void main(String[] args) {
		//Process 2
		int arr[]=new int[5];
		
		/*
		 * Here we are creating one integer array.
		 * using new.
		 * new is a keyword
		 */
		
		//how to take value from user?
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter a value: ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int element:arr)
		{
			System.out.println(element);
		}

	}

}
