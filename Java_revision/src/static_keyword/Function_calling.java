package static_keyword;

public class Function_calling {

//	we can wall one function in other function without creating obj, but to call function directly with out object , that function 
	//need to have "public static" type
	
	public void Screenshots()
	{
		System.out.println("get screenshot");
	}
	
//	static function can call in non static function .
//	but  non static function cannot call in static function
	public  void login()
	{
		Screenshots();
		System.out.println("get screenshot as ");
	}
	
	
	public void registartion()
	{
	
		System.out.println("register");
		login();
	}
	
	// to call sub- function in main function need to create object.
	public static void main(String[] args) {
		
		Function_calling fc=new Function_calling();
//		fc.login();  //if function is not static type then create object of that class
//		login(); // if having "public static " type call directly with function name
fc.registartion();
	}

}
