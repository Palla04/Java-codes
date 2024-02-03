package ClassConcept;

class Student2{
	// Data Member
	// Out side of class can not be accessed
	private int studentID;
	private String Name;
	private int roll;
	/*
	     Here we have defined
	     getter() and setter()
	     for each data member
	     
	     getter() : return a value for that data member
	     setter() : It sets/modify a value for the data member
	 */
	

	public int getStudentID() {
		return studentID;
	}
	public Student2(int studentID, String name, int roll) {
		
		this.studentID = studentID;
		this.Name = name;
		this.roll = roll;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}
public class StudentClass {

	public static void main(String[] args) {
		Student2 Srestha = new Student2(20, "Srestha", 58);
		
		System.out.println(Srestha.getStudentID());
		System.out.println(Srestha.getName());
		System.out.println(Srestha.getRoll());
		
		
		Srestha.setStudentID(10);
		Srestha.setName("Srestha");
		Srestha.setRoll(15);
		
		System.out.println(Srestha.getStudentID());
		System.out.println(Srestha.getName());
		System.out.println(Srestha.getRoll());

	}

}

/*
    *Constructor: 
        It is used for object creation.
        For each object, constructor will be called automatically
        at the time of object creation
        once for each object and at the beginning
        
     Constructor generally of two types
       1. Default constructor
       2. Parameterized constructor
       
      Another one
        copy Constructor
        
      getter() & setter()
        it can be accessed and used multiple time.
        Multiple times for each object and at any time.
        
*/
