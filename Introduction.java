package StringPrograms;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		//Process 1
		String s = "Rishi";
		System.out.println("Name is : "+s);
		
		//Process 2 ->Better than process 1
		String t = new String("Pallabi");
		System.out.println("Name is : "+t);
		
		//Process 3- User Input
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Name is : "+name);
		
		//Process 4
		char ch[] = {'J','A','V','A'};
		/* Convert character array as string */
		String s3 = new String(ch);
		System.out.println(s3);
		
		sc.close();
		
	}

}
