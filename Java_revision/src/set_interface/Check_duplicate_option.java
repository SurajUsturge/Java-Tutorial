package set_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check_duplicate_option {

	public static void main(String[] args) {

		
		List<String> li=new ArrayList<String>();
		
		li.add("test1");
		li.add("test2");
		li.add("test3");
		li.add("test4");
		li.add("test3");
		li.add("test1");
	        
		//here the set is defined only value is not added in this set , so use for loop to add values from list to set
//		while adding value check if one element is not added in one set then 
	        Set<String> uniqueElements = new HashSet<>();  //allow unique element
	        Set<String> duplicates = new HashSet<>(); //store duplicate element
System.out.println(uniqueElements);// value is not added in above set 


	        for (String item : li) {
	            // If add() returns false, the item is already in uniqueElements
	        	
//	        	as per below condition , check element [item] is not added "uniqueElement" set
//	        	 then it will be added to "Duplicate" named Set
	        	
	        if(!uniqueElements.add(item))  //if this return 'False' then value added to 'duplicate' named set
	        {
	        	duplicates.add(item);
	        	 System.out.println("Unique items: " + uniqueElements); 
	        	  System.out.println("Duplicate items: " + duplicates); 
	        }
	        }

//	        System.out.println("Unique items: " + uniqueElements); 
//
//	        System.out.println("Duplicate items: " + duplicates); 
		
	}

}
