package learnjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class LearnCollections {

	public static void main(String[] args) {
		/*//ArrayList
		ArrayList<String> arrayList=new ArrayList<String>(100);
		arrayList.add("vino");
		arrayList.add("ravi");
		arrayList.add("dhruv");
		arrayList.addFirst("kutty");
		arrayList.add(0, "kalai");
		arrayList.trimToSize();
		arrayList.replaceAll(s->s.toUpperCase());          //lambda expression all string s ->s.upper case-changes all to upper case
		System.out.println(arrayList.contains("VINO"));    //checks if array contains vino if matches gives true
		System.out.println(arrayList.equals("kutty"));     //checks the array is equal to kutty but no so false
		System.out.println(arrayList.get(0));              // gets the 0th position value
		System.out.println(arrayList);
		Collections.reverse(arrayList);                    //this reverses the array totally
		System.out.println(arrayList);
		for(String name:arrayList)                         //prints the values in array not the braces
			System.out.print(name+",");
		Collections.sort(arrayList,Collections.reverseOrder());    //sort is for ascending then again collections.reverseOrder is for descending
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		arrayList.clear();                                 //clears the arraylist
		System.out.println(arrayList);*/
		                                                     //Collections.sort is only applicable for list as it maintains order
		/*//Hashset
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("vino");
		hashSet.add("ravi");
		hashSet.add("dhruv");
		hashSet.add("vino");                  //doesn't add this vino as vino is already there-no duplicates
		hashSet.add("kutty");                 //kutty is in 2nd place so no order maintained
		System.out.println(hashSet.size());
		System.out.println(hashSet);          //Collections.sort is not applicable for hashset as no order is maintained
		ArrayList<String> arrayList=new ArrayList<String>(hashSet);   //to use collections convert hashset to arraylist and use Collections.sort
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList.size());*/
		                        
		 /*TreeSet<Integer> treeset=new TreeSet<Integer>();             //treeset removes duplicates and maintains correct order as given
	     treeset.add(20);
	     treeset.add(40);
	     treeset.add(10);
	     treeset.add(05);
	     treeset.add(01);
	     for(int i:treeset)
	     {System.out.println(i);
	     }*/
	       
		//HashMap                                                       
		HashMap<String,String> names=new HashMap<String,String>();         //key should be unique
		names.put("vino", "sekar");
		names.put("vino", "sekar");
		names.put("vino1", "ravi");
		names.put("vino2", "dhruv");
		names.put("vino3", "vino");
		System.out.println(names);
		System.out.println(names.get("vino"));
	
		
		
		
	}

}
