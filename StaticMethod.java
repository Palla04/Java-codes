package ChapterStatic;

class Freshers{
	
	static int cake = 1000;
	int GatePassId;
	Freshers(int Passid){
		this.GatePassId=Passid;
	}
	static void FreshersParty() {
		System.out.println("Enjoy Freshers Party");
		cake = cake-100;
		//System.out.println(this.GatePassId);
		//static method can not hold non-static data member
	}
	/*
	 * Static method should be always:
	 * object independent
	 * so,
	 * that's why non static data member not allowed
	 */
	
}
/*
 *  Here we have defined:
 *    Class Freshers
 *      -Static Data member      [class & object]   ->static int cake = 1000;
 *      -Non static Data member  [object]           ->int GatePassId;
 *      -Constructor                                ->Freshers(int Passid)
 *      -Static method           [class & object]   ->static void FreshersParty()
 */
public class StaticMethod {

	public static void main(String[] args) {
		Freshers Gargi = new Freshers(125);
		Gargi.FreshersParty();
		System.out.println(Freshers.cake);
		
		Freshers Mousumi = new Freshers(120);
		Mousumi.FreshersParty();
		System.out.println(Freshers.cake);

	}

}

/*
 * Static Method:
 * 1. Only Static Data member allowed
 * 
 * Non-Static Method:
 * 1.Static Data member allowed
 * 2.Non-Static Data member allowed
 * 
 * Static Data member allowed:
 * 1.Static Method
 * 2.Non-Static Method
 * 
 * Static Data member can be accessed by Class & Object Both
 * For a Single Static Data member of a Class only one memory will be allocated.
 * 
 * For non static, data member can be accessed by Object.
 * For a Single non-Static Data member of a Class memory will be allocated for each and every object
 * 
 */ 
