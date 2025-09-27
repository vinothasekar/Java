package learnjava;

public class LearnConstructor {
	String name;
	int age;
	
	LearnConstructor(){
		
		System.out.println("default constructor");   //this is default constructor
	}
	
      LearnConstructor(String name){
    	  this.name=name;                           //parameterized constructor 
	}
      void nameMethod() {
    	  System.out.println("My name is :" + name);
      }
      LearnConstructor(String name,int age){
    	  this.name=name;
    	  this.age=age;                           // constructor overloading
	}
      void constrctorOverloading() {
    	  System.out.println("My name is :" + name+"\nMy age is:"+age);
      }
      
      
   public static void main(String[] args)
   {
	   
   LearnConstructor obj=new LearnConstructor("vinotha");
   obj.nameMethod();
   LearnConstructor obj1=new LearnConstructor("vinotha",28);
   obj1.constrctorOverloading();
}}