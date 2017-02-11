package roman_numeral_converter_kata;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class RomanNumeralConverterTest {

	@Test
	public void shouldReturnIFor1(){
		//arrange
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		//act
		String result = testObject.convertArabicToRoman(1);
		//assert
	}

}
