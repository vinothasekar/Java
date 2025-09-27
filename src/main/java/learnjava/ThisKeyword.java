package learnjava;

public class ThisKeyword {
	  String title;
	    double price;

	    ThisKeyword() {
	        this("Unknown", 0.0); // calls the parameterized constructor
	    }

	    ThisKeyword(String title, double price) {
	        this.title = title;
	        this.price = price;
	    }
	    void  values() {
	    	System.out.println(title);
	    	System.out.println(price);
	    }
	String name;
	ThisKeyword(String name)
	{
		this.name=name;
	}
	public void printName()
	{
		System.out.println(this.name);
	}
	
	    void display() {
	        System.out.println("Hello");
	    }

	    void show() {
	        this.display(); // calls the display() method
	    }
	

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword("vino");
		obj.printName();
		obj.show();
		ThisKeyword obj1=new ThisKeyword("book",250);
		obj1.values();
		ThisKeyword obj3=new ThisKeyword();
        obj3.values();
	}

}
