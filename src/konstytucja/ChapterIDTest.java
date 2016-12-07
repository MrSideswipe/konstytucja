package konstytucja;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChapterIDTest {

	@Test
	public void testBelong() {
		assertEquals(true, new ChapterID().belong("I"));
		assertEquals(true, new ChapterID().belong("II"));
		assertEquals(true, new ChapterID().belong("III"));
		assertEquals(true, new ChapterID().belong("IV"));
		assertEquals(true, new ChapterID().belong("V"));
		assertEquals(true, new ChapterID().belong("VI"));
		assertEquals(true, new ChapterID().belong("VII"));
		assertEquals(true, new ChapterID().belong("VIII"));
		assertEquals(true, new ChapterID().belong("IX"));
		assertEquals(true, new ChapterID().belong("X"));
		assertEquals(true, new ChapterID().belong("XI"));
		assertEquals(true, new ChapterID().belong("XII"));
		assertEquals(true, new ChapterID().belong("XIII"));
		assertEquals(false, new ChapterID().belong("XIV"));
		assertEquals(false, new ChapterID().belong("0"));
		assertEquals(false, new ChapterID().belong("i"));
		assertEquals(false, new ChapterID().belong("x"));
		assertEquals(false, new ChapterID().belong("v"));
		assertEquals(false, new ChapterID().belong("3"));
		assertEquals(false, new ChapterID().belong("6"));
		assertEquals(false, new ChapterID().belong("8566"));
		assertEquals(false, new ChapterID().belong("!#¤&/()=?"));
		assertEquals(false, new ChapterID().belong("gadghe645"));
		assertEquals(false, new ChapterID().belong("%"));
		
	}

}
