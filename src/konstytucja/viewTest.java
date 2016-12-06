package konstytucja;

import static org.junit.Assert.*;

import org.junit.Test;

public class viewTest {

	/*
	@Test
	public void testView() {
		assertNotNull(new view("konstytucja.txt"));
		assertNull(new view("brak.txt"));
		//assertNotNull(new view("haha.txt"));
	}
	*/


	@Test
	public void testChapter_start() {
		view test = new view("konstytucja.txt");
		assertNotNull(test.chapter_start("I"));
		assertEquals(47, test.chapter_start("I"));
		assertEquals(1697, test.chapter_start("X"));
		assertEquals(2015, test.chapter_start("XX"));
		assertEquals(2015, test.chapter_start("0"));
		assertEquals(2015, test.chapter_start("%"));
		assertEquals(2015, test.chapter_start("fgqae4tf"));
	}

	@Test
	public void testArtc_start() {
		view test = new view("konstytucja.txt");
		assertNotNull(test.artc_start("1"));
		assertEquals(49, test.artc_start("1"));
		assertEquals(2015, test.artc_start("244"));
		assertEquals(2015, test.artc_start("a"));
		assertEquals(2015, test.artc_start("0"));
		assertEquals(2015, test.artc_start("%"));
		assertEquals(2015, test.artc_start("gergegjk"));
	}


	@Test
	public void testArtc_end() {
		view test = new view("konstytucja.txt");
		assertNotNull(test.artc_end("1", 0));
		assertNotNull(test.artc_end("1", 1000));
		assertEquals(50, test.artc_end("1", 0));
		assertEquals(2015, test.artc_end("1", 1000));
		assertEquals(2015, test.artc_end("250", 1000));
		assertEquals(2015, test.artc_end("0", 1000));
		
	}

	/*
	@Test
	public void testOnly_chapter() {
		fail("Not yet implemented");
	}

	@Test
	public void testArt_art() {
		fail("Not yet implemented");
	}

	@Test
	public void testWhole() {
		fail("Not yet implemented");
	}

	//tutaj ju¿ jest klasa abstrakcyjna
	@Test
	public void testWrite_to() {
		fail("Not yet implemented");
	}

	@Test
	public void testOpen() {
		fail("Not yet implemented");
	}

	@Test
	public void testLines() {
		fail("Not yet implemented");
	}

	@Test
	public void testWrite() {
		fail("Not yet implemented");
	}

	@Test
	public void testClose() {
		fail("Not yet implemented");
	}
	*/

}
