package konstytucja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class write_to {
	public write_to()
	{
		
	}
	/*
	
	private String konst[] = new String [2014];
	

	
	public write_to(String file)
	{
		FileReader fr = this.open(file);
		//int lines = this.lines(fr);
		//this.konst[] = new String [lines];
		//String konst [] = new String [2014];
		this.write(fr, this.konst);
		this.close(fr);	
		
	}
	*/
	
	/*
	public int lines(String file)
	{
		int lines = 0;
		BufferedReader reader;
		
		try
		{
			reader = new BufferedReader(new FileReader(file));
		}
		catch (FileNotFoundException e)
        {
            System.out.println("Blad otwierania");
            System.exit(1);
        }
		
		try
		{
			while (reader.readLine() != null) lines++;
			reader.close();
		}
		catch(IOException e)
        {
            System.out.println("Blad odczytu");
            System.exit(2);
        }
		
		try{
			reader.close();
        }
        catch(IOException e)
        {
            System.out.println("Blad przy zamykaniu");
            System.exit(3);
        }
		
		return lines;
		
		
	}
	*/
	
	//otwieranie pliku o nazwie file
	public FileReader open(String file)
	{
		FileReader fr = null;
	    try {
	       fr = new FileReader(file);
	     
	    } catch (FileNotFoundException e) {
	       System.out.println("Blad otwierania");
	       System.exit(1);
	    }
	    return fr;
	}
	
	// zliczanie ilosci linii w pliku juz otwartym
	public int lines (FileReader fr)
	{
		int lines = 0;
		BufferedReader bfr = new BufferedReader(fr);
		try
		{
			while (bfr.readLine() != null) lines++;
		}
		catch(IOException e)
        {
            System.out.println("Blad odczytu");
            System.exit(2);
        }
		
		return lines;
	}
	
	//zapisywanie pliku do tablicy stringow
	public void write(FileReader fr, String konst[])
	{
        int i = 0;
        int lastIndex=0;
        int last=0;
        String sub = new String();
        String temp = new String();
		BufferedReader br = new BufferedReader(fr);
		try
        {
            while((temp = br.readLine()) != null) // konst[i] = br.readLine()) != null
            {
            	/*
            	if(temp.equals("©Kancelaria Sejmu"))
            	{
            		konst[i] = "";
            		i++;
            		konst[i] = "";
            		br.readLine();
            	}
            	*/
            	
            	if(sub != null)
            	{
            		konst[i] = sub + temp;
            		sub = null;
            	}
            	
            	else
            	{
            		konst[i] = temp;
            	}
            	
            	if(konst[i].endsWith("-"))
            	{
            		lastIndex = konst[i].lastIndexOf(' ');
            		last = konst[i].length();
            		sub = konst[i].substring(lastIndex+1, last-1);
            		konst[i] = konst[i].substring(0, lastIndex);
            	}
            	
                //System.out.println(konst[i]);
                i++;
            }
            konst[i] = "Rozdzia³";
        }
        catch(IOException e)
        {
            System.out.println("Blad odczytu");
            System.exit(2);
        }
	}
	
	//zamykanie pliku
	public void close(FileReader fr)
	{
		try
		{
			fr.close();
		}
		catch (IOException e) 
		{
			System.out.println("Blad zamykania");
	        System.exit(3);
		}
		return;
	}
	
	/*
	public void wypisz()
	{
		int i =0;
		while (i<20)
		{
			System.out.println(this.konst[i]);
			i++;
		}
	}
	*/
	
	

}
