package srinidhi.sixteen.java.programs;

public class RemoveWhiteSpaces {
	static char temp;

	public static void main(String[] args) 
	{
		String str = noSpace("Remove all white spaces from the string");
		System.out.println(str);
	}

	public static String noSpace(String str) 
	{
		String out = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] != ' ')
				out = out + ch[i];
		}

		return out;
	}

}
