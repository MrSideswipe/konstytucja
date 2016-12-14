package konstytucja;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class View extends File{
	
	private String konst[] = new String [2015];
	
	
	
	public View(String file) throws FileNotFoundException, IOException
	{
		FileReader fr = this.open(file);
		//FileReader fr = this.open(file);
		//int lines = this.lines(fr);
		//this.konst[] = new String [lines];
		//String konst [] = new String [2014];
		this.write(fr, this.konst);
		this.close(fr);	
		
	}
	
	public String[] ShowKonst()
	{
		return konst;
	}
	
	public int FindChapterStart (String chapter)
	{
		int i = 0;
		String art = "Rozdzia³ " + chapter;
		do //wykrywanie miejsca rozpoczecia rozdzialu
        {
            if(art.equals(konst[i]))
                break;
           
            i++;
        }while (i < konst.length);
		return i;
	}
	
	public int FindArticleStart (String artc1)
	{
		int i = 0;
		String tmp = "Art. " + artc1 + ".";
		do //wykrywanie miejsca rozpoczecia artykulu
        {
            if(tmp.equals(konst[i]))
                break;
           
            i++;
        }while (i < konst.length);
		return i;
	}
	
	public int FindArticleEnd (String artc2, int i)
	{
		String tmp = "Art. " + artc2 + ".";
		String end = "Art.";
		while(i < konst.length)
		{
			if(tmp.equals(konst[i]))
                break;
           
            i++;
		}

		
		i++;
		while(i < konst.length)
		{
			if(konst[i].startsWith(end))
				break;
			i++;
		}
		
		return i-1;
	}
	
	public void WriteChapter(String chapter)
	{
        int i = FindChapterStart (chapter);
        String art_next = "Rozdzia³";
        
        if (i > 2014)
        	return;
        
       
        // wypisanie zawartosci rozdzialu
       
        do
        {
            if(konst[i].equals("©Kancelaria Sejmu"))
            {
                i=i+2;
            }
            else
            {
                System.out.println(konst[i]);
                i++;
            }
        }while(i < konst.length && !konst[i].startsWith(art_next));
	}
	
	public void WriteArticles(String artc1, String artc2)
	{
		
		int start = FindArticleStart(artc1);
		int end = FindArticleEnd(artc2, start);
		
		int i;
		
        for(i=start; i<=end && i < konst.length; i++)
        {
        	//System.out.println(konst[i]);
        	
            if(konst[i].equals("©Kancelaria Sejmu"))
            {
                i++;
            }
            else
            {
                System.out.println(konst[i]);
            }
            
        }
	}
	
	public void WriteWhole ()
	{
		int i = 0;
		do
		{
			if(konst[i].equals("©Kancelaria Sejmu"))
            {
                i=i+2;
            }
            else
            {
                System.out.println(konst[i]);
                i++;
            }
		}while(i < konst.length && konst[i] != null);
	}
	
}
