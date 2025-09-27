package learnjava;



	 class Animal {
	    void sound() {
	        System.out.println("Animal sound");
	    }
	 }
	 class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	    void sound(String type,int time) {
	        System.out.println("Dog barks"+type+time);
	    }
	}
	 public class LearnInheritance {
	public static void main(String[] args)
	{ 
		Dog obj=new Dog();
		obj.sound("ani",4);
		
	}
}
