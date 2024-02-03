package ConstructorTypes;

/*
 * Default Constructor:
 * Default Constructor is a constructor that is used to initialize the data members of the object
 *  of the class by user defined values passed as parameters.
 *  
 *  in the following example,
 *      we have defined,
 *           this.ProductName = ProductName;
 *           this.ProductPrice = ProductPrice;
 *  
*/
class Products{
	/* Data member */
	String ProductName;
	float ProductPrice;
	/* Default Constructor */
	Products(String ProductName, float ProductPrice)
	{
		this.ProductName = ProductName;
		this.ProductPrice = ProductPrice;
		
	}
	/* Member function */
	void display()
	{
		System.out.println(this.ProductName);
		System.out.println(this.ProductPrice);
	}
}
public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		
		Products p1 = new Products("ABC", 50.00f);
		/* Here at the time of object creation we are not passing any parameters, and with in class Definition,
		 * using parameterized constructor,
		 * we have initialize the values of data members with user defined values*/
		p1.display();

	}

}
