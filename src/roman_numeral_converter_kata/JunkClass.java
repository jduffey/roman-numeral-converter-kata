package roman_numeral_converter_kata;

public class JunkClass {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			//double expDouble = i / 4;
			//int expInt = (int) expDouble;

			double romanBaseX3 = (5.0 / 6.0) * Math.pow(i, 3);
			double romanBaseX2 = - 6 * Math.pow(i, 2);
			double romanBaseX  = (91.0 / 6.0) * (i);
			double romanBaseC  = -8.9;

			// System.out.println("10^" + expInt + " times ");
			System.out.println(i + " : " + romanBaseX3 + ", " + romanBaseX2 + ", " + romanBaseX + ", " + romanBaseC);
			
			int romanBase = (int) (romanBaseX3+romanBaseX2+romanBaseX+romanBaseC);
			System.out.println(romanBase);

		}
	}
}
