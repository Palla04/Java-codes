package ClassConcept;

public class Traveler {
	 /*Class Variable or Data Member */
	String CustomerFName;
	String CustomerMName;
	String CustomerLName;
	String Mob;
	String Email;
	String DOB;
	String Gender;

	public static void main(String[] args) {
		
		/* We are creating object of class Traveler */
		/*how to create one object of a class?
		 * ClassName ObjectName = new ClassName();
		 */

		Traveler Supriyo = new Traveler();
		/*
		 * After execution of this line we are creating an 
		 * object of travel class supriyo.
		 * And,
		 * Also memory will be allocated for this object supriyo.
		 * All the data members and method will be accessible after this line.
		 */
		Supriyo.CustomerFName = new String("Supriyo");
		Supriyo.CustomerMName = new String("");
		Supriyo.CustomerLName = new String("Bose");
		Supriyo.Mob = "8976343693";
		Supriyo.Email = new String("s@gmail.com");
		Supriyo.DOB = new String("30-Apr-2002");
		Supriyo.Gender = new String("Male");
		
		System.out.println(Supriyo.CustomerFName);
		System.out.println(Supriyo.CustomerMName);
		System.out.println(Supriyo.CustomerLName);
		System.out.println(Supriyo.Mob);
		System.out.println(Supriyo.Email);
		System.out.println(Supriyo.DOB);
		System.out.println(Supriyo.Gender);
		
		
		Traveler Pritam = new Traveler();
		/*
		 * Now if Pritam wants to be added as Traveler ,
		 * then we have to create object also for Pritam.
		 * 
		 * After object creation,
		 * Memory will be allocated and there all the concept of class
		 * will come into reality.
		 */
	
		//Problems
		/*
		 * Here we have noticed,
		 * if we are continuing to create objects in this manner
		 * then we have to write similar lines repeatedly for each object.
		 * 
		 * Solution,
		 * Solution is: Use constructor.
		 */
		
	}

}
