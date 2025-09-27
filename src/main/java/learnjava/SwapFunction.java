package learnjava;

public class SwapFunction {
	
	public static void swapFunc(int a,int b) {
		 System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping a= " + a +"and b="+ b);
		
	}

	public static void main(String[] args) {
		int a=3;
		int b=4;
		 System.out.println("Before swapping, a = " + a + " and b = " + b);

	      // Invoke the swap method
	      swapFunc(a, b);
	      System.out.println("\n**Now, Before and After swapping values will be same here**:");
	      System.out.println("After swapping, a = " + a + " and b is " + b);

	}

}
