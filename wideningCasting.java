package Typecasting;
/*
 * Type casting:
 *     1.widening type casting
 *     - Automatically
 *     - It converts a smaller type to a larger type size
 *     byte->short->char->int->long->float->double
 *     
 *     2.narrowing type casting
 *     - It converts a large type to a smaller size type
 *     double->float->long->int->char->short->byte
 *
 *    
 * 
 */
public class wideningCasting {

	public static void main(String[] args) {
		int a= 34;
		long l=a;
		float f=a;
		double d=a;
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}

}
