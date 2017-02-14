package roman_numeral_converter_kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArabicToRomanTest {

	@Test
	public void shouldReturnIFor1(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(1);
		assertEquals("I", result);
	}
	
	@Test
	public void shouldReturnVFor5(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(5);
		assertEquals("V", result);
	}
	
	@Test
	public void shouldReturnXFor10(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(10);
		assertEquals("X", result);
	}
	
	@Test
	public void shouldReturnLFor50(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(50);
		assertEquals("L", result);
	}
	
	@Test
	public void shouldReturnCFor100(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(100);
		assertEquals("C", result);
	}
	
	@Test
	public void shouldReturnDFor500(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(500);
		assertEquals("D", result);
	}
	
	@Test
	public void shouldReturnMFor1000(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(1000);
		assertEquals("M", result);
	}
	
	@Test
	public void shouldReturnIVFor4(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(4);
		assertEquals("IV", result);
	}

	@Test
	public void shouldReturnIXFor9(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(9);
		assertEquals("IX", result);
	}
	
	@Test
	public void shouldReturnXLFor40(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(40);
		assertEquals("XL", result);
	}
	
	@Test
	public void shouldReturnXCFor90(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(90);
		assertEquals("XC", result);
	}
	
	@Test
	public void shouldReturCDFor400(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(400);
		assertEquals("CD", result);
	}
	
	@Test
	public void shouldReturnCMFor900(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(900);
		assertEquals("CM", result);
	}
	
	@Test
	public void shouldReturnIIFor2(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(2);
		assertEquals("II", result);
	}
	
	@Test
	public void shouldReturnIIIFor3(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(3);
		assertEquals("III", result);
	}
	
	@Test
	public void shouldReturnVIFor6(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(6);
		assertEquals("VI", result);
	}
	
	@Test
	public void shouldReturnMMMCDXLIVFor3444(){
		RomanNumeralConverter testObject = new RomanNumeralConverter();
		String result = testObject.convertArabicToRoman(3444);
		assertEquals("MMMCDXLIV", result);
	}
	
}
