package UserInput;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
		
		        /*
		         * Scanner:Here Scanner is a class
		         * Package Name:java.util.
		         * scan: Object of scanner class.
		         * new: used for object creation(used for memory allocation)
		         * 
		         */
				//For integer input in Java
				System.out.println("enter an integer value: ");
				int a = scan.nextInt();
				/*
				 * int a=scan.nextInt();
				 * scan:object of scanner class
				 * nextInt():method of scanner class
				 * scan.nextInt() : it will help to take an integer input from the user and 
				 * it will return that integer value
				 * 				 
				 */
				
				System.out.println("The value is : "+a);
				//Here + operator will concatenate string + int.
				
				//For float input in java
				System.out.println("Enter a Decimal Point value: ");
				float f = scan.nextFloat();
				System.out.println("The value is : "+f);
				
				//For double input in JAVA
				System.out.println("Enter a Decimal Point value: (double) ");
				double d=scan.nextDouble();
				System.out.println("The value is : "+d);
				
				//For character Input
				char ch = 'a';
				System.out.println("The character is :"+ch);
				
				//For String input
				System.out.println("Enter a String");
				scan.nextLine();//Here it will help to remove \n from the buffer
				String s = scan.nextLine();
				/*
				 * It will take input untill there is any \n
				 */
				System.out.println("The  string is: "+s);
				/*
				 * sacn.nextBigDecimal();
				 * sacn.nextBigInteger();
				 * sacn.nextBigBoolean(); //true /false
				 */
				
				scan.close();
				
				
	}

}
