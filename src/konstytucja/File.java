package konstytucja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class File {
	public File()
	{
		
	}

	//otwieranie pliku o nazwie file
	public FileReader open(String file) throws FileNotFoundException
	{
		FileReader fr = null;
	    fr = new FileReader(file);

	    return fr;
	}
	
	// zliczanie ilosci linii w pliku juz otwartym
	/*
	public int lines (FileReader fr) throws IOException
	{
		int lines = 0;
		BufferedReader bfr = new BufferedReader(fr);
		//try
		//{
			while (bfr.readLine() != null) lines++;
		//}
		//catch(IOException e)
        //{
        //    System.out.println("Blad odczytu");
        //    System.exit(2);
        //}
		
		return lines;
	}
	*/
	
	//zapisywanie pliku do tablicy stringow
	public void write(FileReader fr, String konst[]) throws IOException
	{
        int i = 0;
        int lastIndex=0;
        int last=0;
        String sub = new String();
        String temp = new String();
		BufferedReader br = new BufferedReader(fr);
        while((temp = br.readLine()) != null) 
        {

            	
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
            	
                
            i++;
        }
        konst[i] = "Rozdzia³";

	}
	
	//zamykanie pliku
	public void close(FileReader fr) throws IOException
	{

		fr.close();
		return;
	}

	
	

}
