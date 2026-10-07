package extends_keyword_with_non_static;


public class Function_calling extends BaseClass{

	
	public static void main(String[] args) {

//we cannot call baseclass method directly without object inside main method.		
		BaseClass bc=new BaseClass();
		bc.login();
		bc.register();
		bc.otp();
		
		
	}

}
