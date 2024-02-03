package ClassConcept;
/*
         Student Class
           Data Member:
           1.SName
           2.SRoll
           3.SMarks
 */

public class Student {
	/* Data Member of student class */
	
	String SName;
	int SRoll;
	float SMarks;
	
	//constructor
	Student(String SName, int SRoll, float SMarks)
	{
		this.SName = SName;
		this.SRoll = SRoll;
		this.SMarks = SMarks;
	}

	void display() {
		System.out.println(this.SName);
		System.out.println(this.SRoll);
		System.out.println(this.SMarks);
	}
	public static void main(String[] args) {
		
		Student Rajib = new Student("Rajib Saha", 10, 97);
		/*
		 * After execution of this line,
		 * we are creating one object named Rajib.
		 * 
		 * And we have initialized the data members of the classRajib,
		 * using Parameterized constructor like this.
		 * 
		 * this.SName = "Rajib Saha";
		 * this.SRoll = 10;
		 * this.SMarks = 97;
		 * 
		 * here this refers Rajib
		 * this refers always the calling object;
		 * 
		 * Rajib.SName = "Rajib Saha";
		 * Rajib.SRoll = 10;
		 * Rajib.SMarks = 97;
		 */
		Rajib.display();
		Student Pritam = new Student("Pritam Das", 11, 98);
		Pritam.display();
		

	}

}
