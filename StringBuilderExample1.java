package StringBuilderExample;

// Difference between stringBuffer and stringBuilder

/*
 * StringBuffer
 * 1.
 * 2.
 * 3.
 * StringBuilder
 * 1.
 * 2.
 * 3.
 */

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello");
		s.append(" Hi");
		System.out.println(s);
		
		//append()
		s.append(" Hello");
		System.out.println(s);
		
		s.append(" Sunday ").append("Monday ");
		System.out.println(s);
		
		StringBuilder t = new StringBuilder("Hello ");
		System.out.println(t.charAt(0));
		
		for(int i=0;i<t.length();i++)
		{
			System.out.println(t.charAt(i));
		}
		
		/* codePointBefore() : Ascii of 0th character H of string builder s */
		System.out.println(s.codePointBefore(1));
		
		s.insert(2, 'a');
		System.out.println(s);
		/*
		     "Hello".insert(2, 'a');
		     Hello
		     01234
		     we will be insert 'a' at index 2
		     
		     He   llo
		     01 2 345
		     He a llo
		     Heallo   
		 */
		System.out.println(s.isEmpty());
		
		StringBuilder d = new StringBuilder("Today");
		System.out.println(d.indexOf("day"));
		System.out.println(d.indexOf("day", 4));
		// day is not found within Today after 4th character
		
		System.out.println(d.lastIndexOf("day"));
		System.out.println(d.lastIndexOf("day", 4));
		
		//How to convert StringBuilder to string
		String y = d.toString();
		System.out.println(y);
		
		//How to convert string to StringBuffer
		StringBuffer k = new StringBuffer(y);
		System.out.println(k);
		
		//StringBuilder reverse 
		System.out.println(k.reverse());
		
		//StringBuilder replace
		StringBuilder v = new StringBuilder("Today");
		v.replace(2, 4,"done");
		System.out.println(v);
		
		/*
		    v.replace(2,4,"done");
		    "Today".replace(2,4,"done");
		    To da y
		    01 23 4
		    To done y
		    
		    StringBuilder.replace(start,end+1,"String");
		 */
		
		// setCharAt 
		StringBuilder p = new StringBuilder("Today");
		p.setCharAt(4, 'R');
		System.out.println(p);
		/*
		    We are replacing one particular character
		 */
		
		StringBuilder w = new StringBuilder("Today");
		StringBuilder r = new StringBuilder("Today");
		
		System.out.println(w.compareTo(r));
		System.out.println("Today".compareTo("TodaY"));
		System.out.println("TodaY".compareTo("Today"));
		
		
		r.delete(2, 4);/*delete 2th to 3th character */
		System.out.println(r);
		
		StringBuilder a = new StringBuilder("Today");//a reference 100
		StringBuilder b = new StringBuilder("Today");//b reference 200
		StringBuilder c = a;                        //c = reference 100
		
		//reference should be same
	    System.out.println(r.equals(r));
	    System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		
		System.out.println(a.length());
	}

}
