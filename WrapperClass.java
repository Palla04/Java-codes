package Typecasting;
/*
 * Primitive Type          Wrapper Class
 *  1.boolean                1.Boolean
 *  2.char                   2.Character
 *  3.byte                   3.Byte
 *  4.short                  4.Short
 *  5.int                    5.Integer
 *  6.long                   6.Long
 *  7.float                  7.float
 *  8.double                 8.Double
 */
public class WrapperClass {

	public static void main(String[] args) {
		
		Integer x=50;
	    System.out.println(x.toString());
	    int a =25;    //  int primitive data type
	    Integer y=a;
	    y=34;
	    y=Integer.valueOf(a);
	    y=78;
	    
	    System.out.println(Integer.MAX_VALUE);
	    System.out.println(Integer.MIN_VALUE);
		//Integer y = Integer.valueOf(a);   //  y :: Integer Wrapper Class
	    System.out.println(a);
		System.out.println(y);
		
		
	}

}
