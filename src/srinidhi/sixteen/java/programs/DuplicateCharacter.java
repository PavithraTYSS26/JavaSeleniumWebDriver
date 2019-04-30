package srinidhi.sixteen.java.programs;

public class DuplicateCharacter {
public static void main(String[] args) {

	  String str = "w3schools";
	  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) 
	  {
	   for (int j = i + 1; j < str.length(); j++) 
	   {
	    if (inp[i] == inp[j]) 
	    {
	     System.out.println(inp[j]);
	     cnt++;
	     break;
		}
	   }
	}
	  int n=4;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j<=i)
				System.out.print("* ");
			else
				System.out.print("");
		}
		System.out.println();
	}
   }
}
