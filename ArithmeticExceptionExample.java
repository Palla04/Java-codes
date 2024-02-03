package ExceptionHandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		int a =50;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e) {
			//If any ArithmeticException presents with in 
			//try block, catch block will be executed.
			System.out.println("Number can not be divided by zero.");
			System.out.println(e);
		}
		
		finally {
			//If it is defined then
			//it is a mandatory block based on execution
			System.out.println("Finally Block");
		}
		System.out.println("Out of try-catch-finally.");
		
		/*
		 * Here we are trying to perform:
		 *      c = 50/0
		 *      
		 *      this will throw java.lang.ArithmeticException
		 */
		/*
		      what is the difference  between Finally Block and Statements out of try-catch-finally?
		      
		      If there ,
		      
		        exists any exception within try , then catch block will handle the exception,
		        Finally is a compulsory block for execution,
		        irrespective of:
		                    1.Any exception within try block.
		                    2.Any exception with in catch block
		                    
		                But out of try-catch-finally,
		                     the statements will be executed only if there occurs no un-handled exception.
		                     
		             try e problem thakle catch seta mitiya dai kintu catch e problem thakle seta solve hoi na
		             tokhon Out of try-catch-finally execute hobe na.
		 */

	}

}
