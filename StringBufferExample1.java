package StringBufferExample;


/*
 * String:-
 * 1.String class is immutable.
 * 2.String is slow and consumes more memory when you concat too many strings because every time it 
 * create new instance.
 * 3.String Class overrides the equals() method of object class. So you can compare the contents of two 
 * strings by equals() method.
 * 
 * StringBuffer
 * 1.Buffer Class is mutable.
 * 2.StringBuffer is fast and consumes less memory when you concat Strings.
 * 3.StringBuffer Class doesn't override the equals() method of object class.
 */

public class StringBufferExample1 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println(s);
		/*
		 * ClassName : StringBuffer
		 * Constructor : StringBuffer()
		 * s : object ofStringBuffer Class
		 */
		
		/* Method 1: Capacity */
		System.out.println("The Capacity is: "+s.capacity());
		
		/*
		 * Here,
		 * StringBuffer is the Class
		 * s is the object of StringBuffer
		 * we have not initialized s with any String
		 * So, capacity of s will be default(16)
		 */
		
		StringBuffer sb = new StringBuffer("Thursday");
		System.out.println("The String is : "+ sb);
		System.out.println("The Capacity is: "+sb.capacity());
		/*
		 * Here,
		 * StringBuffer is the Class
		 * sb is the object of StringBuffer Initialized with "Thursday"
		 * we have initialized sb with "Thursday"
		 * so, Capacity of s willl be default (16) + length(Thursday)
		 * = 16+8 =24
		 */
		
		 /* Method 2: length of StringBuffer - Available in String */
		System.out.println("The length of sb is :"+sb.length());
		
		/* Method 3 : charAt() - Avaliable in String */
		StringBuffer b = new StringBuffer("Hello");
		System.out.println("The character at index 2: "+b.charAt(2));
		/* Index start from 0 */
		
		/* Method 4 : setCharAt(index, character) */
		StringBuffer r = new StringBuffer("Hello");
		System.out.println("The String r is (before modification) :"+r);
		r.setCharAt(4,'z');
		System.out.println("The String r is (After modification) :"+r);
		
		/* Method 5 : setLength() */
		StringBuffer t = new StringBuffer("Hello");
		System.out.println("The String length (before modification) :"+t.length());
		t.setLength(2);
		System.out.println("The String t length (After modification) :"+t.length());
		System.out.println("The StringBuffer After modification : (Truncate & update) :"+t);
		t.setLength(20);
		System.out.println("The content in t "+t);
		
		/*
		 * If the length of a string (2 here) is less than set length value (20) 
		 * then those extra locations(20-2=18 here) will be initialized with space/block.
		 */
		
		/* Method 6 : getChar() */
		/*
		 * Characters are copied from this sequence into the destination character array dst.
		 * The first Character to be copied is at index srcBegin;
		 * The last character to be copied is at index srcEnd-1.
		 * The total number of characters to be copied is srcEnd-srcBegin.
		 * The characters are copied into the sub-array of dst starting at index dstBegin and
		 * ending at index:
		 * dstbegin + (srcEnd-srcBegin) - 1
		 * 
		 * Parameeters:
		 * srcBegin : start copying at this offset.
		 * srcEnd : stop copying at this offset.
		 * dst : the array to copy the data into.
		 * dstBegin : offset into dst.
		 */
		
		StringBuffer x = new StringBuffer("01234567890123456");
		char w[]=new char[100];
		x.getChars(5, 10,w,3);
		/*
		 * Here we are copying from 5th index to (10-1) = 9th index.
		 * And stored in character array w at starting index 3.
		 */
		for(int i=0;i<w.length;i++)
		{
			System.out.print(w[i]+" ");
		}
		System.out.println();
		/* Method 7 : append() */
		String a;
		int c= 42;
		StringBuffer q = new StringBuffer(40);
		a=q.append("c = ").append(c).append("!").toString();
		System.out.println(a);
		
		StringBuffer p = new StringBuffer("Classroom");
		//--p is a stringBuffer [Nature : Mutable]
		p.append(" Java Class");
		//"java class" will be append (append : insert at the end)
		System.out.println(p);
		
		String k = new String();
		//blank string
		k = p.toString();
		//--StringBuffer to string conversion
		System.out.println(k);
		
		/* Method 8: insert(index,String) */
		StringBuffer m = new StringBuffer("I Java");
		m.insert(2,"like ");
		System.out.println(m);
		/*
		 * We insert " like " at index 2 in "I java",
		 * so, result will be "I like java".
		 */
		
		//Method 9: Replace
		StringBuffer f = new StringBuffer("This is JAVA Class");
		f.replace(8, 12, "Python");
		System.out.println(f);
		
		//Method 10: Reverse
		StringBuffer tt = new StringBuffer("Sunday");
		System.out.println(tt);
		tt.reverse();
		/*
		 * In StringBuffer string itself will be reversed and modified
		 */
		System.out.println(tt);
		
		//Method 11: delete()
		StringBuffer d = new StringBuffer("Today is Sunday");
		d.delete(2, 5);
		/*
		 * Today is Sunday.
		 * 0123456789...
		 * d.delete(start,end+1);
		 * start : 2
		 * end : 4
		 * It will delete 2nd,3rd and 4th character.
		 */
		System.out.println(d);
		
		//Method 12 : deleteCharAt
		StringBuffer f1 = new StringBuffer("Today is Sunday");
		f1.deleteCharAt(2);
	    System.out.println(f1);
	    /*
	         delete() Vs deleteCharAt()
	     * delete() takes 2 arguments.
	     * deleteCharAt takes only 1 argument
	     * 
	     * delete() : Used to delete more than one character mainly
	     * daleteCharAt() : Used to delete particular character
	     */
	    
	    //Method 13 : compareTo()
	    StringBuffer a1 = new StringBuffer("Today is Sunday");
	    StringBuffer a2 = new StringBuffer("Today is SundaY");
	    System.out.println(a1.compareTo(a2));
	    
	    /*
	     * StringBuffer1.compareTo(StringBuffer2);
	     * a1 : xcvba
	     * a2 : xcvbA
	     * Ascii(a) - Ascii(A) = 97-65 = 32
	     * 
	     * a1 : xcvbA
	     * a2 : xcvba
	     * Ascii(A) - Ascii(a) = 65-97 = -32
	     */
	    
	    //Method 14 : isEmpty()
	    System.out.println(a1.isEmpty());
	    /*
	     * It will check if StringBuffer is empty or not
	     */
	    
	    //Method 15 : lastIndexOf()----Available in string
	    StringBuffer p1 = new StringBuffer("Today is Sunday");
	    System.out.println(p1.lastIndexOf("day"));
	    /*
	     * "Today is Sunday".lastIndexOf("day");
	     * searching will be start from right to left
	     * 
	     * Today is Sunday
	     * 012345678901234
	     * 
	     * day :2 to 4  day : 12 to 14
	     */
	    
	    System.out.println(p1.lastIndexOf("day", 6));
	    //6 denotes ending index
	    /*
	     * "Today is Sunday".lastIndexOf("day",6);
	     * 
	     * Searching will be from right(6th) to left(0th).
	     * Today i
	     * 0123456
	     * day : 2 to 4
	     */
	    
	    
	    //Method 16 : indexOf()
	    System.out.println(p1.indexOf("day"));
	    /*
	     * "Today is Sunday".indexOf("day");
	     * searching will be start from left to right
	     * 
	     * Today is Sunday
	     * 012345678901234
	     * 
	     * day :2 to 4  day : 12 to 14
	     */
	    System.out.println(p1.indexOf("day", 6));
	  //6 denotes starting index
	    /*
	     * "Today is Sunday".indexOf("day",6);
	     * 
	     * Searching will be from left(6th) to right(End).
	     * is Sunday
	     * 678901234
	     * day : 12 to 14
	     */
     }

}
