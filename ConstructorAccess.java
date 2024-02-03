package InheritanceCoding;

class DemoFather{
	int var = 90;
	DemoFather(){
		System.out.println("Father Class Constructor");
	}
	
	DemoFather(int a){
		System.out.println("Father Class Constructor and a ="+a);
	}
}
class DemoSon extends DemoFather{
	int var = 80;
	DemoSon(){
		super();//calling Default Constructor of Parent //DemoFather()
		//by default super(); working
		System.out.println("Child class Constructor");
	}
	
	DemoSon(int a){
		super(a); //DemoFather(a)
		System.out.println("Child class Constructor and a ="+a);
	}
	
	DemoSon(int a,int b){
		super(); //DemoFather()
		System.out.println("Child class Constructor and a and b ="+a +"and"+b);
	}
	
	void display() {
		System.out.println("Child var: "+this.var);
		System.out.println("Parent var: "+super.var);
	}
}
public class ConstructorAccess {

	public static void main(String[] args) {
		
		DemoSon Son = new DemoSon();
		/*
		    2. DemoSon() => Child class Default Constructor
		    1. DemoParent() => Parent class Default constructor as
		    from Child class constructor super() is getting called
		 */
		/*
		     Here we have noticed,
		     for Son Object of DemoSon,
		     a) Parent class constructor will be invoked
		     b) Child class constructor will be invoked
		 */
		System.out.println();
		DemoSon Child1 = new DemoSon(20,40);
		/*
	    2. DemoSon(20,40) => Child class Parameterized Constructor
	    1. DemoFather() => Parent class Default constructor as
	    from Child class constructor super() is getting called
	    */
		System.out.println();
		DemoSon Child2 = new DemoSon(50);
		/*
	    DemoSon(50) => 1 parameterized constructor of DemoSon getting called
	    There in the first line.
	    super(a) is mentioned, that means,
	    Parent class 1 parameterized constructor is called.
	    */
		
		Child2.display();

	}

}


/*
     super() should be always at the first line of the constructor not for method only for constructor. 
*/
