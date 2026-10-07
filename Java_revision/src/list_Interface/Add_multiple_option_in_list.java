package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class Add_multiple_option_in_list {

	public static void main(String[] args) {

//add option in arraylist  and find specific option in list and check it is present or not.
		
//	check specific option is present in  list or not.
		
		List<String>fruits=new ArrayList<String>();
		fruits.add("test1");
		fruits.add("test2");
		fruits.add("test3");
		fruits.add("test4");
		fruits.add("");
		fruits.add(" ");
		System.out.println(fruits.size());		
		fruits.set(3, "test6");  //replace the existing value.
		System.out.println(fruits);
		fruits.remove("test3");

System.out.println(fruits);

System.out.println("third element is: "+'"'+fruits.get(2)+'"');
		
//total element in array are
	System.out.println("total element in arrays are: "+fruits.size());
	String expecte="test6";
	boolean found=false;
	
	
	//use isBlank() to check option is empty or empty blank space like  
//	""   //empty 
//	"  "  //blank string contains blank space
 	
	for(String str:fruits) {
			if(str.equals(expecte)||str.isBlank())
			{
				System.out.println("found expected element or blank:"+ str+"  "+ fruits.indexOf(str));
				found=true;
			}
		}
			if(found)
			{
				System.out.println("expected fruit is present");
			}
			else
			{
				System.out.println("expected fruti not preset");
			}
	}
}