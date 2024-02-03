package InheritanceCoding;
class DemoParent{
	void display() {
		System.out.println("Parent");
	}
}
class DemoChild extends DemoParent{
	void display() {
		super.display();
//		super.display();
//		PareentClass.display();
		System.out.println("Child");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		DemoParent Parent = new DemoParent();
		DemoChild Child = new DemoChild();
		
//		Child.displayP();
//		Child.displayC();
//		
		/*
		 * If Parent and Child class both have different named method,
		 * the obviously Child class object can access both of them without any issue.
		 */
		Child.display();
		/*
		 * Here we have noticed as Child class have the same named method,
		 * then Child class will provide more priority to its own method over Parent's method.
		 * 
		 */

	}

}
