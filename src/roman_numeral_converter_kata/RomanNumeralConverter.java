package roman_numeral_converter_kata;

import java.util.HashMap;

public class RomanNumeralConverter {

	public String convertArabicToRoman(int input) {

		int counter = input;

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

		String romanStringOutput = "";

		for (int i = 3; i >= 0; i--) {

			int exp = i % 4;

			for (int j = 4; j >= 1; j--) {

				if (i == 3) {
					double romanBase = sequenceGenerator(3, 1);
					int romanBaseInt = (int) romanBase;
					while (counter >= romanBaseInt) {
						romanStringOutput += hmap.get(romanBaseInt);
						counter -= romanBaseInt;
					}

				} else {
					double romanBase = sequenceGenerator(exp, j);
					int romanBaseInt = (int) romanBase;
					while (counter >= romanBaseInt) {
						romanStringOutput += hmap.get(romanBaseInt);
						counter -= romanBaseInt;
					}
				}
			}
		}

		return romanStringOutput;
	}

	private double sequenceGenerator(int exp, int j) {
		double romanBase = Math.pow(10, exp)
				* ((5.0 / 6.0) * Math.pow(j, 3) - 6 * Math.pow(j, 2) + (91.0 / 6.0) * (j) - 9.0);
		return romanBase;
	}

	public int convertRomanToArabic(String input) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("I", 1);
		hmap.put("IV", 4);
		hmap.put("V", 5);
		hmap.put("IX", 9);
		hmap.put("X", 10);
		hmap.put("XL", 40);
		hmap.put("L", 50);
		hmap.put("XC", 90);
		hmap.put("C", 100);
		hmap.put("CD", 400);
		hmap.put("D", 500);
		hmap.put("CM", 900);
		hmap.put("M", 1000);

		String stringToParse = input;
		int arabicValue = 0;

		while (stringToParse.length() > 1) {

			String targetLetter = String.valueOf(stringToParse.charAt(0));

			String nextLetter = String.valueOf(stringToParse.charAt(1));

			if (hmap.get(nextLetter) > hmap.get(targetLetter)) {

				String comboLetter = targetLetter + nextLetter;
				arabicValue += hmap.get(comboLetter);
				stringToParse = stringToParse.substring(2); // Ask Mike about
															// this.

			} else {

				arabicValue += hmap.get(targetLetter);
				stringToParse = stringToParse.substring(1); // Is this line
															// needed?
			}

		}

		if (stringToParse.length() == 1) {

			arabicValue += hmap.get(stringToParse);

		}

		return arabicValue;
	}
}
