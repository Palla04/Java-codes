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
 */
public class narrowingCasting {

	public static void main(String[] args) {
		double d = 9.84;
		int a =(int)d;//for larger to smaller we use (int)
		float f = (float)d;
		
		double t = f;
		
		
		System.out.println("d="+d);
		System.out.println("a="+a);
        System.out.println("f="+f);
        System.out.println("t="+t);
	}

}
