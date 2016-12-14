package konstytucja;

import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainKonstytucja {
	public static void main(String[] args)
	{
		try
		{
			int count = args.length;
			int number1, number2;
			if(count == 0)
				return;
			View konstytucja = new View(args[0]);
			//Boolean flag;
			
			//Car car1 = new Car();
			
			//konstytucja.only_chapter("I");
			//konstytucja.chapter_art_art("I", "2", "2");
			
			switch (count)
			{
			case 1:
				konstytucja.WriteWhole();
				break;
				
			case 2:
				if(new ChapterID().belong(args[1]))
					konstytucja.WriteChapter(args[1]);
				else
				{
					// czy tak mozna??????????????????????????
					try
					{
						number1=Integer.parseInt(args[1]);
					}
					catch(NumberFormatException e){
						out.println("Arguments are invalid");
			        	return;
					}
					//
					if(number1<=243 && number1>=1)
						konstytucja.WriteArticles(args[1], args[1]);
					else
						throw new IllegalArgumentException("Arguments are invalid");
				}
				break;
				
			case 3:
				number1=Integer.parseInt(args[1]);
				number2=Integer.parseInt(args[2]);
				if(number2<=243 && number1>=1)
					konstytucja.WriteArticles(args[1], args[2]);
				else
					throw new IllegalArgumentException("Arguments are invalid");
				
				break;
				
			default:
				throw new IllegalArgumentException("Arguments are invalid");
			}
			
			
			/*
			if(count == 1)
			{
				konstytucja.WriteWhole();
			}
			//number1=Integer.parseInt(args[1]);
			//System.out.println(number1);
			if(count == 2)
			{
				if(new ChapterID().belong(args[1]))
					konstytucja.WriteChapter(args[1]);
				else
				{
					// czy tak mozna??????????????????????????
					try
					{
						number1=Integer.parseInt(args[1]);
					}
					catch(NumberFormatException e){
						out.println("Arguments are invalid");
			        	return;
					}
					//
					if(number1<=243 && number1>=1)
						konstytucja.WriteArticles(args[1], args[1]);
					else
						throw new IllegalArgumentException("Arguments are invalid");
				}
				
			}
			
			if(count == 3)
			{
				number1=Integer.parseInt(args[1]);
				number2=Integer.parseInt(args[2]);
				if(number2<=243 && number1>=1)
					konstytucja.WriteArticles(args[1], args[2]);
				else
					throw new IllegalArgumentException("Arguments are invalid");
			}
			
			if(count > 3)
				throw new IllegalArgumentException("Arguments are invalid");
			
			*/
			
			
			return;
		}
		
		catch(IllegalArgumentException ex)
        {
        	out.println(ex);
        	return;
        }
		catch(FileNotFoundException ex)
        {
        	out.println(ex);
        	return;
        }
		catch(IOException ex)
        {
        	out.println(ex);
        	return;
        }
	}

}
