package learnjava;

public class LearnEncapsulation {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
		
	} 
	public void setName(String name) {
		this.name=name;
		
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public static void main(String[] args) {
		LearnEncapsulation obj=new LearnEncapsulation();
		obj.setAge(21);
		obj.setName("Vino");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		

	}

}
