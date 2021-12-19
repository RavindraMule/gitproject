package trial;

public class class1 
{
	public static void main(String[]arg)
	{
		String rev="ravindra";
		String rec="";
		for(int a=rev.length()-1;a>=0;a--)
		{
			 rec = rec+rev.charAt(a);
		}
		System.out.println(rec);
				
	}

}
