package roman_numeral_converter_kata;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class RomanNumeralConverterTest {

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
	
	

}
