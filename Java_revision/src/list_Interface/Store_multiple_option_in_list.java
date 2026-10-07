package list_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store_multiple_option_in_list {

	public static void main(String[] args) {

		
//		store multiple option in list- arraylist. 
		
		 List<String> fruits = new ArrayList<>();
	        fruits.add(0,"Apple");
	        fruits.add(1,"Banana");// 
	        fruits.add(2, "Mango");  //replaced first option at same index.
	        fruits.add(3, "cat");
	        System.out.println(fruits);
	        List<String> sorted=new ArrayList<>(fruits);
//in list interface in sorting of options - aphabeticall order of upper case then lower case options shown
//	        , so , first replace all to lowercase then sort 
	        sorted.replaceAll(String::toLowerCase);

	        //ascending order
	        sorted.sort(String.CASE_INSENSITIVE_ORDER);
	        System.out.println(sorted);

	        
//	        descending order
	        sorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());
	        System.out.println(sorted);
	        
	       //duplicates are allowed in list interface.
//	        duplicates are not allowed in Set interface
	        
//		check options at specific index as expected or not
	        if(fruits.get(0).equals("Mango"))
	        {
	        	System.out.println("apple");
	        }
	        else
	        {
	        	System.out.println("wrong");
	        }
	        
	        
	}

}
