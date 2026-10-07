package default_variable;

public class Public_variables {

	public static void main(String[] args) {

		
		
//we can chage value of static variabl in main class by directly with Baseclass name .
		TestData.student1="tester";
		System.out.println(TestData.students());

//		default varible in other class can be access by creating object of that class
		TestData data=new TestData();
		System.out.println(data.tester);
	
	}

}
