package StringPrograms;

public class Program17_replace {

	public static void main(String[] args) {
		String s1 = new String("ClassPlus");
		String s2 = new String("room");
		
		String s3 = s1.replace("Plus", s2);
		System.out.println(s3);
		
		/*
		    s1.replace("Plus", s2);
		    "ClassPlus".replace("Plus",s2 );
		    "ClassPlus".replace("Plus","room" );
		    Classroom
		 
		 
		      Here,
		      String1 contain "ClassPlus"
		      String2 contain "room"
		      
		      s1.replace("Plus", s2);  --> It will not modify s1, 
		      it will return new string reference
		      
		      if you wish to modify s1
		      then you may write,
		      s1 = s1.replace("Plus", s2); 
		 */
		
		String s4 = new String("ClassPlusPlusPlus");
		s4 = s4.replace("Plus", s2);
		System.out.println(s4);
	}

}
