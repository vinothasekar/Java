package learnjava;

public class LearnString {
	
	public static void main(String[] args) {
        // Step 1: Declare a string
        String name= "Vinotha,ravi";
        String name2="vinotha ravi";
        

        // Step 2: Use split() method to split by space
        String substring = name.substring(4,9);

        System.out.println(substring);  //output-tha,r
        
        //length,equals,contains,upper
        System.out.println(name.length());  //12
       System.out.println(name==name2);     //false
       System.out.println(name.contains("Vino"));   //true
       String upper=name.toUpperCase();      //VINOTHA,RAVI
       System.out.println(upper);
       
       //char at
       System.out.println(name.charAt(2));
       
       //charArray
       char[] characterArray=name.toCharArray();
       for(int i=0;i<characterArray.length;i++)
       {
    	   System.out.println(characterArray[i]);
       }
       
       //replace
       String price="$42,000";
       String orginalPrice=price.replaceAll("[^0-9]", "");
       System.out.println(orginalPrice);
       //concat
       System.out.println(name=name.concat("married"));
       System.out.println(name);
       
       
       /*String is immutable because of
         1)security purpose string mostly used in username and passwords 
         2)String pool efficiency
         3)thread safe 
       */
       //String builder
       
       String sentence="hello123";
       System.out.println(sentence.toUpperCase());
      String words=sentence.toUpperCase();
       StringBuilder sb=new StringBuilder(words);
       sb.append("shuffle");
         System.out.print(sb.toString());
         
        
        }
    
}


