package roman_numeral_converter_kata;

public class ScratchPadClass {

	public static void main(String[] args) {

		for (int i = 3; i >= 0; i--) {

			int exp = i % 4;

			for (int j = 4; j >= 1; j--) {

				if (i == 3) {
					exp = 3;
					j = 1;
					double romanBase = Math.pow(10, exp)
							* ((5.0 / 6.0) * Math.pow(j, 3) - 6 * Math.pow(j, 2) + (91.0 / 6.0) * (j) - 9.0);
					System.out.println(romanBase);
					break;
				} else {
					double romanBase = Math.pow(10, exp)
							* ((5.0 / 6.0) * Math.pow(j, 3) - 6 * Math.pow(j, 2) + (91.0 / 6.0) * (j) - 9.0);

					System.out.println(romanBase);

				}
			}
		}
	}

}