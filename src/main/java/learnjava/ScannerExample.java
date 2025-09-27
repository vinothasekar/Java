package learnjava;

import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter user name:");
		 
		String uName=obj.nextLine();
		System.out.println("user name is:"+uName);
		

	}

}
