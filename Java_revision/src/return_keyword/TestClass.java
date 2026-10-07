package return_keyword;

public class TestClass {

	public static void main(String[] args) {

//we can chage value of static variabl in main class by directly with Baseclass name .
		TestData.student1="tester";
		
//		to print value of variable which is stored in function can be fetch when function return the value.
		System.out.println(TestData.students());
	
	}

}
