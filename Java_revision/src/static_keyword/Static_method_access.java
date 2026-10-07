package static_keyword;

public class Static_method_access {
	
	
//to access global variable in same class need to use static keyword.
	
	public static String name="testing";
	
	public String test="testing";
	public  void students()
	{
		System.out.println(name);
	}
	
public static void main(String[] args) {

	// if global variable type is not static then we cannot access it directly 
		System.out.println(name);
//		System.out.println(test);   //we cannot access global variable in same class which does not have static keyword
		
	//if method type is not static then need to create object of Baseclass
	Static_method_access base=new Static_method_access();
	base.students();
		
	}
	
}
