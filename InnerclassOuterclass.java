package InnerClassExample;

class Outer{
	int a = 10;
	void displayOuter() {
		System.out.println("Outer class method");
	}
	class Inner{
		int b = 20;
		void displayInner(){
			System.out.println("Inner class method");
		}
	}
	
	Inner innerObj = new Inner();
	/*
	 * Important::
	 * we have to create object of inner class with in the scope of outer class.
	 * 
	 * To access properties of Inner by innerObj
	 * 1. innerObj.b
	 * 2. innerObj.displayInner()
	 */
}
public class InnerclassOuterclass {

	public static void main(String[] args) {
		Outer outerObj = new Outer();
		System.out.println(outerObj.a);
		outerObj.displayOuter();
		System.out.println(outerObj.innerObj.b);
		outerObj.innerObj.displayInner();
		
		/*
		 * To access innerObj by outerObj:
		 *  outerObj.innerObj
		 *  
		 *  To access properties of Inner by outerObj
		 *  1. outer.innerObj.b
		 *  2. outerObj.innerObj.displayInner()
		 */

	}

}
