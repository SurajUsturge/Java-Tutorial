package extends_with_static_keyword;
public class BaseClass {
	
//	common functions like get screenshot , gettext, click(), mousehover to webelement, sorting, sendkeys
//	this common functions can store in one separate class, whose type can be public static , so it can be call without creating object ,
//	just by extends that class 
	
	
	public  static void register()
	{
		System.out.println("registeratino");
	}
	public static void otp()
	{
		System.out.println("get otp");;
	}
	
	
	//here static function cannot call non static method
	public static void login()
	{
		register();
		otp();
		System.out.println("login");
	}
	
	

}
