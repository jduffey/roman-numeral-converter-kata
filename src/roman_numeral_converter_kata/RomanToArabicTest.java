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
	
	@Test
	public void shouldReturn5ForV(){
		assertEquals(5, testObject.convertRomanToArabic("V"));
	}
	
	@Test
	public void shouldReturn10ForX(){
		assertEquals(10, testObject.convertRomanToArabic("X"));
	}
	
	@Test
	public void shouldReturn50ForL(){
		assertEquals(50, testObject.convertRomanToArabic("L"));
	}
	
	@Test
	public void shouldReturn100ForC(){
		assertEquals(100, testObject.convertRomanToArabic("C"));
	}
	
	@Test
	public void shouldReturn500ForD(){
		assertEquals(500, testObject.convertRomanToArabic("D"));
	}
	
	@Test
	public void shouldReturn1000ForM(){
		assertEquals(1000, testObject.convertRomanToArabic("M"));
	}
	
	@Test
	public void shouldReturn2000ForMM(){
		assertEquals(2000, testObject.convertRomanToArabic("MM"));
	}

}
