package Constructor;

class Voter{
	//Data member
	int id;
	String Name;
	String Address;
	
	//Default Constructor
	Voter(){
		this.id = 100;
		this.Name = "Anonymous";
		this.Address="Unknown";
	}
	/*
	 * when we are creating object of voter with out any parameter or argument,
	 * then default constructor will help you to initialize
	 * the data members of that object with some default value.
	 * 
	 * Here, we initialized object with default value.
	 */
	
	//Parameterized Constructor
	Voter(int id, String Name, String Address){
		this.id = id;
		this.Name = Name;
		this.Address=Address;
	}
	
	//Copy constructor
	Voter(Voter v){
		this.id = v.id;
		this.Name = v.Name;
		this.Address = v.Address;
	}
	
	void display()
	{
		System.out.println(this.id);
		System.out.println(this.Name);
		System.out.println(this.Address);
	}
	

	
}


public class CopyConstructor {

	public static void main(String[] args) {
		
		Voter Pritam = new Voter();
		Pritam.display();
		
		Voter Pranay = new Voter(200,"Pranay","Uttarpara");
		Pranay.display();
		
        Voter Akash = new Voter(Pranay);
        Akash.display();
	}

}
