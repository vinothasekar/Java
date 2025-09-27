package learnjava;
 
interface Payment{
   void pay();
   
}
  //method overriding 
class CreditCard implements Payment{
	 public void pay() { 
		System.out.println("pay using credit card");
	}}
	 class UPI implements Payment{
		 public void pay() {
			System.out.println("pay using UPI");
		}
	
}
public class Polymorphism {
	public static void main(String[] args) {
		Payment credit=new CreditCard();
		credit.pay();
		credit=new UPI();
		credit.pay();
		
	}

}
