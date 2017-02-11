package roman_numeral_converter_kata;

import java.util.HashMap;

public class RomanNumeralConverter {

	public String convertArabicToRoman(int input) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "I");
		hmap.put(5, "V");
		hmap.put(10, "X");
		hmap.put(50, "L");
		hmap.put(100, "C");
		hmap.put(500, "D");
		hmap.put(1000, "M");

		return hmap.get(input);
	}
}
