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
	public void shouldReturn4ForIV(){
		assertEquals(4, testObject.convertRomanToArabic("IV"));
	}
	
	@Test
	public void shouldReturn9ForIX(){
		assertEquals(9, testObject.convertRomanToArabic("IX"));
	}
	
	@Test
	public void shouldReturn40ForXL(){
		assertEquals(40, testObject.convertRomanToArabic("XL"));
	}
	
	@Test
	public void shouldReturn90ForXC(){
		assertEquals(90, testObject.convertRomanToArabic("XC"));
	}
	
	@Test
	public void shouldReturn400ForCD(){
		assertEquals(400, testObject.convertRomanToArabic("CD"));
	}
	
	@Test
	public void shouldReturn900ForCM(){
		assertEquals(900, testObject.convertRomanToArabic("CM"));
	}
	
	@Test
	public void shouldReturn3000ForMMM(){
		assertEquals(3000, testObject.convertRomanToArabic("MMM"));
	}
	
	@Test
	public void shouldReturn300ForCCC(){
		assertEquals(300, testObject.convertRomanToArabic("CCC"));
	}
	
	@Test
	public void shouldReturn30ForXXX(){
		assertEquals(30, testObject.convertRomanToArabic("XXX"));
	}

}
