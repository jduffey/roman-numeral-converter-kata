package roman_numeral_converter_kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanToArabicTest {
	
	private RomanNumeralConverter testObject;

	@Before
	public void setup(){
		testObject = new RomanNumeralConverter();
	}
	
	@Test
	public void shouldReturn1ForI(){
		assertEquals(1, testObject.convertRomanToArabic("I"));
	}

}
