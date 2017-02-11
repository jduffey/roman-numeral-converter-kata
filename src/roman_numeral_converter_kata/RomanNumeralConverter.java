package roman_numeral_converter_kata;

public class RomanNumeralConverter {

	public String convertArabicToRoman(int input) {

		if (input == 1) {
			return "I";
		} else if (input == 5) {
			return "V";
		} else if (input == 10) {
			return "X";
		} else if (input == 50) {
			return "L";
		} else if (input == 100){
			return "C";
		} return "D";
	}
}
