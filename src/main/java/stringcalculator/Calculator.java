package stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if (numbers.equals("")) {
			return 0;
		}
		else if(numbers.contains(",")) {
			String [] addNumbers = numbers.split(",");
			return toInt(addNumbers[0]) + toInt(addNumbers[1]);
		}
		else {
			return toInt(numbers);
		}
	}

	public static int toInt(String number) {
		return Integer.parseInt(number);
	}
}