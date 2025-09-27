package learnjava;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {                        //ArithmeticException
			System.out.println("not divided by zero");
		}
		try {
			String s = null;
			System.out.println(s.length());
		}

		catch (NullPointerException e) {                          //NullPointerException
			System.out.println("null pointer exception");
		}
			try {                                                 //ArrayIndexOutOfBoundsException  
				int[] a = { 1, 2, 3, 4 };
				System.out.println(a[10]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("out of bound exception");
			}
		 finally {                                               //finally is always executed 
			System.out.println("always executed");
		}
		try {
			checkAge(10);
		}
		catch(Exception ex) {
			System.out.println("error: "+ex.getMessage());
		}}  static void checkAge(int age)throws Exception{       //throws used in method signature give warning like it might throw this exception
			if (age<18)
			{
				throw new Exception("age is less");             //throw is used in method body to throw an exception 
				
			}
			
		}

	

}
