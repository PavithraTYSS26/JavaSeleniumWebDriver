package srinidhi.sixteen.java.programs;

public class Palindrome {
	public static void main(String[] args)
	{
		boolean out=isPalindrome("paaapa");
	
		System.out.println(out);
	}
	public static boolean isPalindrome(String str)
	{
		char[] ch=str.toCharArray();
		String out="";
		for (int i = 0; i < ch.length; i++) 
		{
			out=ch[i]+out;
		}
		
		return str.equalsIgnoreCase(out);
	}	

}
