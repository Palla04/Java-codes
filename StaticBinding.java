package Binding;

class Human{
	public static void walk() {
		System.out.println("Human Walks");
	}
	private void display() {
		System.out.println("Display Human");
	}
	
	final void show() {
		System.out.println("final Human");
		this.display();
	}
}

class Boy extends Human{
	public static void walk() {
		System.out.println("Boy Walk");
	}
	private void display() {
		System.out.println("Display Human");
	}
	
	/*final void show() {
		System.out.println("final Human");
		this.display();
	}
	*/
}

public class StaticBinding {

	public static void main(String[] args) {
		
		Human obj1=new Boy();//dynamic binding // override holo na Static ache tai
		
		/*
		 * Reference : Boy
		 * object : Human
		 */
		Human obj2 = new Human();//static binding
		
		obj1.walk();   //Human walks
		obj2.walk();   //Human walks
		obj1.show();
		//obj1.display();
		
		

	}

}
/*
 *Static : Accessible from main()    : Child can not inherit parent class static method : same static method can be
 *                                                                                              defined with in child class
 *private: Not accessible from main(): Child can not inherit parent class private method: same private method can be
 *                                                                                              defined with in child class
 *final  : Accessible from main()    : Child can not inherit parent class final method  : same final method can not be
 *                                                                                              defined with in child class
 */

