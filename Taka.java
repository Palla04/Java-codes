package UserInput;

import java.util.Scanner;

public class Taka {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("UserName: ");
		 String s=scan.nextLine();
		 System.out.println(""+s);
		 
		 System.out.println("UserAddress: ");
		 String a=scan.nextLine();
		 System.out.println(""+a);
		 
		 System.out.println("Age: ");
		 int r=scan.nextInt();
		 System.out.println(""+r);
		 
		 System.out.println("Cost of Product: ");
		 double d=scan.nextDouble();
		 System.out.println(""+d);
		 
		 System.out.println(s + " who is living at " + a + " of age " + r + " has purchased a product of Rs." + d);
		 
		

	}

}
