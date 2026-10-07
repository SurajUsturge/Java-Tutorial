package list_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_option_in_List {

	public static void main(String[] args) {

		List<String>li=new ArrayList<String>();
		
		li.add("A");
		li.add("b");
		li.add("J");
		li.add("e");
		li.add("D");
		li.add("F");
		
		
		System.out.println("original list is :"+ li);
		
		List<String>sorted=new ArrayList<String>(li);
// below function ignore case sensitive order and arrange element in ascending order		
		sorted.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("Ascending sorted list is: "+sorted);		
		
		
		//now descending order
		sorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());
		System.out.println("descending sorted list is: "+sorted);		
		
	}

}
