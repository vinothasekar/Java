package learnjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> List=new LinkedList<String>();
		List.add("vino");
		List.add("Ravi");
		List.add(1,"Dhruv");
		List.addFirst("vino1");
		System.out.println(List.isEmpty());
		List.remove(0);
		for(String Lists:List)
		{
			System.out.println(Lists);
		}
		
	}

}

