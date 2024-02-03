package UserInput;

import java.io.*;
import java.util.Scanner;
public class DataInputStreamExample {

	public static void main(String[] args)throws NumberFormatException, IOException {
		/*Integer Input*/
		System.out.println("Enter a value");
		DataInputStream d=new DataInputStream(System.in);
		//Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(d.readLine());
		System.out.println(x);
		
		System.out.println("Enter a float value");
		float y = Float.parseFloat(d.readLine());
		System.out.println(y);
		
		System.out.println("Enter a double value");
		double z = Double.parseDouble(d.readLine());
		System.out.println(z);
		
		System.out.println("Enter a String");
		String s = d.readLine();
		System.out.println(s);
		
		System.out.println("Enter a Character");
		char ch = d.readLine().charAt(0);
		System.out.println(ch);
		
		/*System.out.println("Enter a Character:");
		String c=d.readLine();
		char ch = c.
		System.out.println(s);*/
	}

}
