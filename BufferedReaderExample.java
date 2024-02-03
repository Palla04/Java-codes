package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderExample {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		String name = reader.readLine();
		/*
		 * reader.readLine() -
		 * it will help you to take the sentence from user
		 */
		System.out.println("The name is : "+name);
		System.out.println("Enter your number");
		int a = reader.read();
		System.out.println("The ascii value is : "+a);
		
		//'2' -> Int -> ascii(2)=50;
		reader.readLine();
		System.out.println("Enter the number: ");
		int num=Integer.parseInt(reader.readLine());
		System.out.println("The value is: "+num);
		
		System.out.println("Enter the number: ");
		float num1 =Float.parseFloat(reader.readLine());
		System.out.println("The value is: "+num1);
		
		reader.close();

	}

}
