package ConstructorTypes;
/*
 * Default Cpnstructor:
 * Default Constructor is a constructor that is used to initialize the data members of the object
 *  of the class by default value.
 *  
 *  in the following example,
 *        we have defined,
 *           ProductName = "Anonymous";
 *           ProductPrice = 0.0f;
*/


class Product{
	/* Data member */
	String ProductName;
	float ProductPrice;
	/* Default Constroctor */
	public Product()
	{
		this.ProductName = "Anonymous";
		this.ProductPrice = 0.0f;
		
	}
	/* Member function */
	void display()
	{
		System.out.println(this.ProductName);
		System.out.println(this.ProductPrice);
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		/* We are creating Object */
		Product p1 = new Product();
		/* Here at the time of object creation we are not passing any parameters, and with in class Definition,
		 * using default constructor,
		 * we have initialize the values of data members with default values*/
		p1.display();
		Product p2 = new Product();
		p2.display();

	}

}
