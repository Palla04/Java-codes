package ClassConcept;

import java.util.Scanner;

public class Trainer {
	/*   A class contains :
	     1. Data Member
	     2. Member function / Method
	 */
	
	// Data Member
	int trainerID;
	String trainerName;
	String sub;

	// Member Function / Method
	void trainerInfo() {
		System.out.println("Trainer ID: "+this.trainerID);
		System.out.println("Trainer Name: "+this.trainerName);
		System.out.println("Trainer Subject: "+this.sub);
	}
	void taskAssign() {
		System.out.println("Task Assign to Student: ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Trainer Sourav = new Trainer();
		/* Here 
		   Trainer   : class
		   Sourav    : Object of Trainer Class
		   new       : keyword here used for object reference creation
		   Trainer() : Constructor
		*/
		
		System.out.println(Sourav);
		System.out.println(new Trainer());
		System.out.println("Enter the ID of Sourav : ");
		Sourav.trainerID = sc.nextInt();
		System.out.println("Sourav.trainerID : "+Sourav.trainerID);
		
		Trainer Rishi = new Trainer();
		Rishi.trainerID = 104;
		Rishi.trainerName = ("Rishi Banerjee");
		Rishi.sub = "Political Science";
		
		Rishi.trainerInfo();
		Rishi.taskAssign();
		
		Trainer Koyel = new Trainer();
		Koyel.trainerID = 107;
		Koyel.trainerName = ("Koyel Roy");
		Koyel.sub = "Health Science";
		
		Koyel.trainerInfo();
		Koyel.taskAssign();
	}

}
