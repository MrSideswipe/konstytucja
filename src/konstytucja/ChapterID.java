package konstytucja;

public class ChapterID {
	private String chapters [] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII"};
	
	public Boolean belong (String letter)
	{
		int count = chapters.length;
		int i;
		for(i=0; i<count; i++)
		{
			if (chapters[i].equals(letter))
				return true;
		}
		return false;
	}
	
}

