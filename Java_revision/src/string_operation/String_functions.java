package string_operation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class String_functions {

	public static void main(String[] args) {

		int num= 85654654;
		
		
		//convert number to string
		
//		valueOf(int) function to convert number to string.
		String numString=String.valueOf(num);
		
		
//		OR
//		convert number to string
		String stringNum=Integer.toString(num);
		System.out.println(stringNum);
		
		System.out.println(numString);
		
//		calculate length of string/ count number of character in string.
		int lengthS=numString.length();
		System.out.println(lengthS);
		
		//identify specific single character in string 
		char specificChar=numString.charAt(2);
		System.out.println(specificChar);
		
		//cut string from specific index.
		String name="javaProgramming";
		String splitname=name.substring(4);  //this will show string from 4th index  ,index start from 0.
String splitRange=name.substring(4, 8);  //start at 4 index and endIndex-1
System.out.println(splitRange);
		
		System.out.println(splitname);
		
		//compare string with expected string
		if(splitname.equals("Programming"))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		

		//check specific char sequence is present in string or not .
		if(splitname.contains("gramm"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		//	compare two string and ignore case sensitivity.
//		when first main string contains lower /uppercase then first make it lower case then check 
	// equalignorecase check if both string is equal
//	in below condtion both string are different so return not represnt	
		if("Programming".equalsIgnoreCase("prog"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
		//to check specific text is presnt in string then 
		//here instead of equalignore case use below method
//		1. first convert "ProGramming to lowercase => programming
//		2.check the "gram" text is presnet in text or not.
		if("ProGraMming".toLowerCase().contains("gram"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
//		replace char or string 
		
		String date="16/05/1996";
		String newDate=date.replace("/", ":");
		System.out.println(newDate);
		
//		get dynamic date and we can specify date and time format 
		Date dt=new Date();	
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    LocalDateTime current = LocalDateTime.now(); 
        String formattedDateTime = current.format(formatter);
        System.out.println(formattedDateTime); 
	

        
//	equalIgnorecase= this function =compare the expected and actual string when both are exact same - it ignore case sensitivity
        String lang="programming";
        if(lang.equalsIgnoreCase("prograMmING"))
        {
        	System.out.println("correct");
        }
        else
        {
        	System.out.println("wrong ");
        }
        
        
//     split string from specific part and replace data in parts.
        
        String dateformat = "2026-09-10_12-51-00"; 
        
        // 1. Split the string into date and time parts by space
        String[] parts = dateformat.split("_");
        String datePart = parts[0];
        String timePart = parts[1];
        
        // 2. Replace the old delimiter (e.g., '-') with ':'
        timePart = timePart.replace('-', ':');
        
        System.out.println("Date: " + datePart);
        System.out.println("Time: " + timePart);
        
        
        
        
//start with function to check string start with specific char sequence
        
        String nameformat="INsuraj";
        
    if(nameformat.startsWith("IN"))
    	{
        	System.out.println("correct start IN");
        }
    else
        {
        	System.out.println("wrong startup");
        	System.out.println();
        }
   
  //trim blank spaces at right and left side of string
  	String language ="   Program   ";
  	System.out.println(language.trim());
		

  	///get price in string by replcing special character.
 String splitstring="Order #84920 has been placed successfully.";
		String[] number=splitstring.split(" ");
		String price=number[1];
		//now remove # sign 
		System.out.println(price.replace("#",""));

    

//		find specific text in string and extract value
	String str="Order INV-9921 has been placed successfully.";
	int index= str.indexOf("INV-");
	int endindex=str.indexOf(" has");
	String id=str.substring(index,endindex);
	System.out.println(id);
		
		
		
	}
	
}