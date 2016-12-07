package konstytucja;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewTest {

	/*
	@Test
	public void testView() {
		assertNotNull(new View("konstytucja.txt"));
		assertNull(new View("brak.txt"));
		//assertNotNull(new View("haha.txt"));
	}
	*/


	@Test
	public void testFindChapterStart() {
		View test = new View("konstytucja.txt");
		assertNotNull(test.FindChapterStart("I"));
		assertEquals(47, test.FindChapterStart("I"));
		assertEquals(1697, test.FindChapterStart("X"));
		assertEquals(2015, test.FindChapterStart("XX"));
		assertEquals(2015, test.FindChapterStart("0"));
		assertEquals(2015, test.FindChapterStart("%"));
		assertEquals(2015, test.FindChapterStart("fgqae4tf"));
	}

	@Test
	public void testFindArticleStart() {
		View test = new View("konstytucja.txt");
		assertNotNull(test.FindArticleStart("1"));
		assertEquals(49, test.FindArticleStart("1"));
		assertEquals(2015, test.FindArticleStart("244"));
		assertEquals(2015, test.FindArticleStart("a"));
		assertEquals(2015, test.FindArticleStart("0"));
		assertEquals(2015, test.FindArticleStart("%"));
		assertEquals(2015, test.FindArticleStart("gergegjk"));
	}


	@Test
	public void testFindArticleEnd() {
		View test = new View("konstytucja.txt");
		assertNotNull(test.FindArticleEnd("1", 0));
		assertNotNull(test.FindArticleEnd("1", 1000));
		assertEquals(50, test.FindArticleEnd("1", 0));
		assertEquals(2015, test.FindArticleEnd("1", 1000));
		assertEquals(2015, test.FindArticleEnd("250", 1000));
		assertEquals(2015, test.FindArticleEnd("0", 1000));
		
	}

	/*
	@Test
	public void testWriteChapter() {
		fail("Not yet implemented");
	}

	@Test
	public void testWriteArticles() {
		fail("Not yet implemented");
	}

	@Test
	public void testWriteWhole() {
		fail("Not yet implemented");
	}

	//tutaj ju¿ jest klasa abstrakcyjna
	@Test
	public void testFile() {
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
