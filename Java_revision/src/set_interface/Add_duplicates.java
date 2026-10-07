package set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Add_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> uniqueFruits = new HashSet<>();

        // 1. Adding elements
        uniqueFruits.add("bpple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");

        // 2. Attempting to add a duplicate
       uniqueFruits.add("Apple"); 
       System.out.println(uniqueFruits);

       
//       even if duplicate options try to added it will not accepts twice.
       //without showing error
       
       System.out.println(uniqueFruits.size());
       
//       convert the set to List 
       
       List<String> li=new ArrayList<String>(uniqueFruits);
       
       li.sort(String.CASE_INSENSITIVE_ORDER);
       
       System.out.println(li);
	}

}
