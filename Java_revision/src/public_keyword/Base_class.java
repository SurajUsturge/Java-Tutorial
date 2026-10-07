package public_keyword;

public class Base_class {
	
	
//to access variable in same class need to use static keyword.
	
	static String name="testing";
	
	public  void students()
	{
		System.out.println(name);
	}
	
public static void main(String[] args) {

	
	System.out.println(name);
	
	//if method type is not "public static" then need to create object of Baseclass
	Base_class base=new Base_class();
	base.students();
	}
	
}
