package learnjava;

interface Functional{
	void hello();	
}
interface Addinterface{
	int add(int a,int b);
}
public class LambdaExpressio {
	public static void main(String[] args) {
		Functional func=() ->System.out.println("Hello using lambda");
		Addinterface addobj=(a,b)->a+b;
		System.out.println(addobj.add(3,4));
	     func.hello();
	}
	
}
