package string_operation;

public class Convert_String_to_number_and_kept_remaing_string {

	public static void main(String[] args) {

//		convert string to number and trim remaining string.
	
		String numString="4568ABSLC";

		String[]num=numString.split("A");
		
		String number=num[0];
		String str=num[1];
		
		System.out.println(number);

		System.out.println(str);
	}

}
