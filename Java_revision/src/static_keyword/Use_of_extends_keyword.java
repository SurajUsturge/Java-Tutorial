package static_keyword;

public class Use_of_extends_keyword  extends Common_functions{

	public static void main(String[] args) {

		
//		use "public static" keyword to access variable or methods directly in baseclass  to parent class, then we can access it directly.

//Note 1.=> when variable is declared with "static" keyword then we can access it with class name directly.
//Note 2.=>	 when variable is not declared with static then we can access it by creating object of parent class, but that variable type should "Public"
		
		System.out.println(num);  //call variable directly with class name.
		Common_functions.gettext(); //call static method directly with class name.

		
		
		//OR create  object of parent class to access base class variable.
		Use_of_extends_keyword base=new Use_of_extends_keyword();
		System.out.println(base.num);
	
//		*****************************************
// Polymorphism does NOT work with static methods
//        Vehicle polymorphicCar = new Car("SUV", 5);
		
		
		
	}

}
