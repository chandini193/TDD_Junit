package chandini.com.ttd_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Remove_a_InFirstTwoCharsTest {

	@Test
	public void testFirst2A() {
		Remove_a_InFirstTwoChars remove_a_InFirstTwoChars = new Remove_a_InFirstTwoChars();
		String actual = remove_a_InFirstTwoChars.removeA("BACD");
		assertEquals("BCD", actual);
	}
	
	@Test
	public void testFirst1A() {
		Remove_a_InFirstTwoChars remove_a_InFirstTwoChars = new Remove_a_InFirstTwoChars();
		String actual = remove_a_InFirstTwoChars.removeA("CABCD");
		assertEquals("CBCD", actual);
	}
	
	@Test
	public void testEmptyString() {
		Remove_a_InFirstTwoChars remove_a_InFirstTwoChars = new Remove_a_InFirstTwoChars();
		String actual = remove_a_InFirstTwoChars.removeA("");
		assertEquals("", actual);
	}
	@Test
	public void testSingleA() {
		Remove_a_InFirstTwoChars remove_a_InFirstTwoChars = new Remove_a_InFirstTwoChars();
		String actual = remove_a_InFirstTwoChars.removeA("A");
		assertEquals("", actual);
	}
	@Test
	public void testTwoA() {
		Remove_a_InFirstTwoChars remove_a_InFirstTwoChars = new Remove_a_InFirstTwoChars();
		String actual = remove_a_InFirstTwoChars.removeA("AA");
		assertEquals("", actual);
	}
	@Test
	public void testNoFirstTwoA() {
		Remove_a_InFirstTwoChars remove_a_InFirstTwoChars = new Remove_a_InFirstTwoChars();
		String actual = remove_a_InFirstTwoChars.removeA("BBACDEF");
		assertEquals("BBACDEF", actual);
	}
}