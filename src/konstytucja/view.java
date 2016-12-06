package konstytucja;

import java.io.FileReader;

public class view extends write_to{
	
	private String konst[] = new String [2015];
	

	
	public view(String file)
	{
		FileReader fr = this.open(file);
		//int lines = this.lines(fr);
		//this.konst[] = new String [lines];
		//String konst [] = new String [2014];
		this.write(fr, this.konst);
		this.close(fr);	
		
	}
	
	public int chapter_start (String chapter)
	{
		int i = 0;
		String art = "Rozdzia� " + chapter;
		do //wykrywanie miejsca rozpoczecia rozdzialu
        {
            if(art.equals(konst[i]))
                break;
           
            i++;
        }while (konst[i] != null);
		return i;
	}
	
	public int artc_start (String artc1)
	{
		int i = 0;
		String tmp = "Art. " + artc1 + ".";
		do //wykrywanie miejsca rozpoczecia artykulu
        {
            if(tmp.equals(konst[i]))
                break;
           
            i++;
        }while (konst[i] != null);
		return i;
	}
	
	public int artc_end (String artc2, int i)
	{
		String tmp = "Art. " + artc2 + ".";
		String end = "Art.";
		do //wykrywanie miejsca poczatku konca artykulu
        {
            if(tmp.equals(konst[i]))
                break;
           
            i++;
        }while (konst[i] != null);
		
		i++;
		do // wykrywanie konca
		{
			if(konst[i].startsWith(end))
				break;
			i++;
		}while (konst[i] != null);
		
		return i-1;
	}
	
	public void only_chapter(String chapter)
	{
        int i = chapter_start (chapter);
        String art_next = "Rozdzia�";
        
       
        // wypisanie zawartosci rozdzialu
       
        do
        {
            if(konst[i].equals("�Kancelaria Sejmu"))
            {
                i=i+2;
            }
            else
            {
                System.out.println(konst[i]);
                i++;
            }
        }while(!konst[i].startsWith(art_next));
	}
	
	public void art_art(String artc1, String artc2)
	{
		int start = artc_start(artc1);
		int end = artc_end(artc2, start);
		
		int i;
		
        for(i=start; i<=end; i++)
        {
        	//System.out.println(konst[i]);
        	
            if(konst[i].equals("�Kancelaria Sejmu"))
            {
                i++;
            }
            else
            {
                System.out.println(konst[i]);
            }
            
        }
	}
	
	public void whole ()
	{
		int i = 0;
		do
		{
			if(konst[i].equals("�Kancelaria Sejmu"))
            {
                i=i+2;
            }
            else
            {
                System.out.println(konst[i]);
                i++;
            }
		}while(konst[i] != null);
	}
	
}