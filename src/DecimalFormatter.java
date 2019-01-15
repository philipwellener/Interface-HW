
public class DecimalFormatter 
{
	public String format(int num)
	{
		String str = "" + num;
		String form = "";
		for(int i = 0; i<str.length(); i++)
		{
			 form += str.charAt(str.length()-i);
			 if(i % 3 == 0  && i != str.length())
			 {
				 form += ".";
			 }
		}
		return form;
	}
}
