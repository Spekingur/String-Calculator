package stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if (numbers.equals("")) {
			return 0;
		}
		else if(numbers.contains(",") || numbers.contains("\n")) {
			String [] addNumbers = numbers.split(",|\n");
			int total = 0;
			int iterator = 0;

			while (iterator < addNumbers.length) {
				total += toInt(addNumbers[iterator]);
				iterator++;
			}
			return total;
		}
		/*else if(numbers.contains("\n")) {
			String [] addNumbers = numbers.split("\n");
			int total = 0;
			int iterator = 0;

			while (iterator < addNumbers.length) {
				total += toInt(addNumbers[iterator]);
				iterator++;
			}
			return total;
		}*/
		else {
			return toInt(numbers);
		}
	}

	public static int toInt(String number) {
		return Integer.parseInt(number);
	}
}