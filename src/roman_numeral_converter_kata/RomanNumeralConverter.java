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
}
