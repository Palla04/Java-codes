package ChapterStatic;
class Employee{
	static int count = 0;
	/*
	 * count is sharable b/w all the object and class itself
	 */
	Employee()
	{
		System.out.println("New Employee joined.");
		count++;
	}
	void display() {
		System.out.println("Total no of Employee : "+count);
	}
}
public class StaticDatamember {

	public static void main(String[] args) {
		System.out.println(Employee.count);
		//here count is sharable or accessed by class name
		
		Employee Saheli = new Employee();
		System.out.println(Employee.count);
		System.out.println(Saheli.count);
		/*
		 * Ststic Data Member(Count) can be accessed by both
		 * 1. class
		 * 2. object
		 */
		Employee Himanshu = new Employee();
		System.out.println(Employee.count);
		Himanshu.display();

	}

}
