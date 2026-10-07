package parameter_functions_with_value_return;

public class BaseClass {

	public static int totalPrice(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	
	
	
	
//non static function can call static function 
//	but static function can not call non static function.
	
//after return the value from other function we can use returned value multiple times. as below if 
	public static void getaddition()
	{
		int result=	totalPrice(5, 10);
		System.out.println(result+20);
		System.out.println(result+50);
	}
	
//	------------------------------------------------------------------
	
	
	public static void totalPrice1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	//if not return value  then 
	public static void totalTax()
	{
		totalPrice1(44, 22);
	
//		here we cannot use added total to do further operations 
//		if value is return then 
//    int result=totalprice(44,22);
//		result+CGST
//		result +SGST
		
//		we can use return value multiple times
		
	}
	
	
}
