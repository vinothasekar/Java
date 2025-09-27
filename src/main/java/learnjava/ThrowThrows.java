package learnjava;

public class ThrowThrows {
	
	public static void validate(int age) throws ArithmeticException{
		if(age>18)
		{
       throw new ArithmeticException("eligible");
	}else
		System.out.println("not eligible");
	}
	public static void main(String[] args) {
	  try {
         validate(23);
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("caught");
		  }
	  }

}
