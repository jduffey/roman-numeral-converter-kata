package roman_numeral_converter_kata;

import java.util.HashMap;

public class RomanNumeralConverter {

	public String convertArabicToRoman(int input) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "I");
		hmap.put(4, "IV");
		hmap.put(5, "V");
		hmap.put(9, "IX");
		hmap.put(10, "X");
		hmap.put(40, "XL");
		hmap.put(50, "L");
		hmap.put(90, "XC");
		hmap.put(100, "C");
		hmap.put(400, "CD");
		hmap.put(500, "D");
		hmap.put(900, "CM");
		hmap.put(1000, "M");

		String output = "";

		if (input < 4) {

			for (int i = 1; i <= input; i++) {
				output += hmap.get(1);
			}
			return output;
		} else

		return hmap.get(input);
	}
}
