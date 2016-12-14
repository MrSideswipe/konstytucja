package konstytucja;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import java.io.IOException;

public class ViewTest {

	
	@Test
	public void testView() {
		
		
		try
		{
			assertNotNull(new View("konstytucja.txt"));
			assertNotNull(new View("haha.txt"));
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
		
		try
		{
			new View("brak.txt");
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (true);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
		
	}
	

	
	
	


	@Test
	public void testFindChapterStart() {
		try
		{
			View test = new View("konstytucja.txt");
			assertNotNull(test.FindChapterStart("I"));
			assertEquals(47, test.FindChapterStart("I"));
			assertEquals(1697, test.FindChapterStart("X"));
			assertEquals(2015, test.FindChapterStart("XX"));
			assertEquals(2015, test.FindChapterStart("0"));
			assertEquals(2015, test.FindChapterStart("%"));
			assertEquals(2015, test.FindChapterStart("fgqae4tf"));
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
		
	}

	@Test
	public void testFindArticleStart() {
		try
		{
			View test = new View("konstytucja.txt");
			assertNotNull(test.FindArticleStart("1"));
			assertEquals(49, test.FindArticleStart("1"));
			assertEquals(2015, test.FindArticleStart("244"));
			assertEquals(2015, test.FindArticleStart("a"));
			assertEquals(2015, test.FindArticleStart("0"));
			assertEquals(2015, test.FindArticleStart("%"));
			assertEquals(2015, test.FindArticleStart("gergegjk"));
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
		
	}


	@Test
	public void testFindArticleEnd() {
		try
		{
			View test = new View("konstytucja.txt");
			assertNotNull(test.FindArticleEnd("1", 0));
			assertNotNull(test.FindArticleEnd("1", 1000));
			assertEquals(50, test.FindArticleEnd("1", 0));
			assertEquals(2015, test.FindArticleEnd("1", 1000));
			assertEquals(2015, test.FindArticleEnd("250", 1000));
			assertEquals(2015, test.FindArticleEnd("0", 1000));
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
	}
	
	
	@Test
	public void testWriteChapter() {
		try
		{
			View test = new View("konstytucja.txt");
			test.WriteChapter("I");
			test.WriteChapter("o");
			assertTrue (true);
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
		
	}
	
	@Test
	public void testWriteArticles() {
		try
		{
			View test = new View("konstytucja.txt");
			test.WriteArticles("1", "2");
			test.WriteArticles("3", "3");
			test.WriteArticles("o", "a");
			test.WriteArticles("4", "3"); // przy takim bledzie pisze od 4 do konca
			assertTrue (true);
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
	}

	
	@Test
	public void testWriteWhole() {
		try
		{
			View test = new View("konstytucja.txt");
			test.WriteWhole();
			//Runtime.getRuntime().exec("cls");
			assertTrue (true);
			
		}
		catch(FileNotFoundException ex)
		{
			assertTrue (false);
		}
		catch(IOException ex)
		{
			assertTrue (false);
		}
	}

	/*
	//tutaj ju¿ jest klasa abstrakcyjna
	@Test
	public void testFile() {
		fail("Not yet implemented");
	}
	*/
	/*
	@Test
	public void testOpen() {
		fail("Not yet implemented");
	}
	*/
	/*
	@Test
	public void testLines() {
		fail("Not yet implemented");
	}
	*/
	/*
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
