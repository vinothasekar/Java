package learnjava;

abstract class Vino{
	abstract void makeDosa();
	abstract void makeIdli();
	void makePoori(){
System.out.println("breakfast is poori");
}}
	
	class Ravi extends Vino{
	@Override
	void makeDosa() {
		System.out.println("Dinner dosa");
	}
	void makeIdli() {
		System.out.println("idli ");
	}
	
	}
public class LearnAbstract  {

	public static void main(String[] args) {
		
		Vino v=new Ravi();     //abstract vino v= new ravi  calls the  abstract method in vino only 
		v.makeDosa();          //if method only in ravi class is called it wont work
		v.makePoori();         //create new obj ravi r=new ravi to call all the methods in ravi
		
		v.makeIdli();
		
		

	}

	
	
}
