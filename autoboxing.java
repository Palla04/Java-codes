package Typecasting;

public class autoboxing {
     /* Convert fromPrimitive to Wrapping */
	public static void main(String[] args) {
		int a=20;
		Integer i = Integer.valueOf(a);  //Convert Primitive to Wrapper explicitly
		Integer k = a;                   //Convert Primitive to Wrapper implicitly
		System.out.println(a);
		System.out.println(i);
		System.out.println(k);

	}

}
