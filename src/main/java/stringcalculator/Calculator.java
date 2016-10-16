package stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if (numbers.equals("")) {
			return 0;
		}
		else if(numbers.contains(",")) {
			String [] addNumbers = numbers.split(",");
			return Integer.parseInt(addNumbers[0]) + Integer.parseInt(addNumbers[1]);
		}
		else {
			return Integer.parseInt(numbers);
		}
	}	
}