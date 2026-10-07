package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class Count_option_without_blank_empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruits=new ArrayList<String>();
		fruits.add("test1");
		fruits.add("test2");
		fruits.add("test3");
		fruits.add("test4");
		fruits.add("");
		fruits.add(" ");
		System.out.println("including blank: "+fruits.size());		
int total=fruits.size();

int count =0;

for(String str:fruits)
{
	//if option is not blank then count increase 
	if(!str.isBlank())
	{
		count++;
	}
	
}
int total1=total-count;
System.out.println("total count excluding blank option is : "+count);
System.out.println("blank options count is : "+total1);

	}

}
