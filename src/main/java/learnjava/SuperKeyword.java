package learnjava;

class AnimalSuper{
	void sound() {
		System.out.println("Animal sound");
	}
}
class DogSuper extends AnimalSuper{
	void sound() {
		super.sound();
		System.out.println("Dog sound");
	}
}

public class SuperKeyword {
	

	public static void main(String[] args) {
	DogSuper d=new DogSuper();
	d.sound();
		
	}

}
