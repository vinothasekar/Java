package learnjava;

interface MyInteface{
	public void sum();
	default void add()
{   System.out.println("Add two methods");
		}
	static void multiply() {System.out.println("Static method");}
	}

public class LearnAbstractAndInterface implements MyInteface {
	
	
	public void add() {
	System.out.println("add new methods");}

	public static void main(String[] args) {
		MyInteface  obj=new LearnAbstractAndInterface();
		obj.add();
       obj.sum();
        MyInteface.multiply();
	}

	@Override
	public void sum() {
		System.out.println("sum method implementation");
		
	}

	
}

