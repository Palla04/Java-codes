package AggregationAndAssociation;
/* student has an address */
class Address{
	int streetno;
	String City;
	String Country;
	public Address(int streetno, String city, String country) {
		this.streetno = streetno;
		this.City = city;
		this.Country = country;
	}
	
}

class Student{
	String fname;
	String lname;
	Address addr; //aggregation
	public Student(String fname, String lname, Address addr) {
		this.fname = fname;
		this.lname = lname;
		this.addr = addr;
	}
	
}
public class Aggregation {

	public static void main(String[] args) {
		Address a = new Address(10,"Kolkata","India");
		System.out.println(a);
		System.out.println(a.streetno);
		System.out.println(a.City);
		System.out.println(a.Country);

		Student Arpan = new Student("Arpan","Roy",a);
		System.out.println(Arpan.fname);
		System.out.println(Arpan.lname);
		System.out.println(Arpan.addr);
		System.out.println(Arpan.addr.streetno);
		System.out.println(Arpan.addr.City);
		System.out.println(Arpan.addr.Country);

	}

}
