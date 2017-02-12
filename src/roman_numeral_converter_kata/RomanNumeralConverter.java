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

		String output = "";

		while (counter >= 1000) {
			output += hmap.get(1000);
			counter -= 1000;
		}

		while (counter >= 900) {
			output += hmap.get(900);
			counter -= 900;
		}

		while (counter >= 500) {
			output += hmap.get(500);
			counter -= 500;
		}

		while (counter >= 400) {
			output += hmap.get(400);
			counter -= 400;
		}

		while (counter >= 100) {
			output += hmap.get(100);
			counter -= 100;
		}

		while (counter >= 90) {
			output += hmap.get(90);
			counter -= 90;
		}

		while (counter >= 50) {
			output += hmap.get(50);
			counter -= 50;
		}

		while (counter >= 40) {
			output += hmap.get(40);
			counter -= 40;
		}

		while (counter >= 10) {
			output += hmap.get(10);
			counter -= 10;
		}

		while (counter >= 9) {
			output += hmap.get(9);
			counter -= 9;
		}

		while (counter >= 5) {
			output += hmap.get(5);
			counter -= 5;
		}

		while (counter >= 4) {
			output += hmap.get(4);
			counter -= 4;
		}

		while (counter >= 1) {
			output += hmap.get(1);
			counter -= 1;
		}

		return output;
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

		for (stringToParse.length() > 1) {

			while (stringToParse.substring(0, 1).equalsIgnoreCase("M")) {
				
				while(stringToParse.length() > 1){
					
					stringToParse = stringToParse.substring(1);
				}
				
				arabicValue += 1000;
			}

			return arabicValue;
		}
		return hmap.get(stringToParse);
	}
}
