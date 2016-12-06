package konstytucja;

import static org.junit.Assert.*;

import org.junit.Test;

public class chapterTest {

	@Test
	public void testBelong() {
		assertEquals(true, new chapter().belong("I"));
		assertEquals(true, new chapter().belong("II"));
		assertEquals(true, new chapter().belong("III"));
		assertEquals(true, new chapter().belong("IV"));
		assertEquals(true, new chapter().belong("V"));
		assertEquals(true, new chapter().belong("VI"));
		assertEquals(true, new chapter().belong("VII"));
		assertEquals(true, new chapter().belong("VIII"));
		assertEquals(true, new chapter().belong("IX"));
		assertEquals(true, new chapter().belong("X"));
		assertEquals(true, new chapter().belong("XI"));
		assertEquals(true, new chapter().belong("XII"));
		assertEquals(true, new chapter().belong("XIII"));
		assertEquals(false, new chapter().belong("XIV"));
		assertEquals(false, new chapter().belong("0"));
		assertEquals(false, new chapter().belong("i"));
		assertEquals(false, new chapter().belong("x"));
		assertEquals(false, new chapter().belong("v"));
		assertEquals(false, new chapter().belong("3"));
		assertEquals(false, new chapter().belong("6"));
		assertEquals(false, new chapter().belong("8566"));
		assertEquals(false, new chapter().belong("!#¤&/()=?"));
		assertEquals(false, new chapter().belong("gadghe645"));
		assertEquals(false, new chapter().belong("%"));
		
	}

}
