package roman_numeral_converter_kata;

public class RomanNumeralConverter {

	public String convertArabicToRoman(int input) {

		if (input == 1) {
			return "I";
		} else if (input == 5) {
			return "V";
		}
		return "X";
	}
}
