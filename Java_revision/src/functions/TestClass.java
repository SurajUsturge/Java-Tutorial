package functions;

public class TestClass extends BaseClass{

//extends base class to get all functions in baseclass
	
	public static void main(String[] args)
	{
//=>>>>>>>> call the methods in other class directly by name only.
//		=>  use "public static" keyword.
		
		//we can call method directly by function name when method type is "public static".
		
//		 this need to extends the base class to call directly the base class functions.
		stud();		
		gettext();
		
//		methods to  call static method 
//1.  by creating object of base class
		BaseClass base=new BaseClass();
		base.webelement();
		
//2.  by directly calling with classname.function name
		BaseClass.webelement();
		
//3.  by dirctly with function name as function is static type
		webelement();
		
	}
}
