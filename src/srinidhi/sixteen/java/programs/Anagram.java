package srinidhi.sixteen.java.programs;

public class Anagram {
	 
	 
	 	public static String removeSpace(String str)
	 	{
	 		String out="";
	 		char[] ch=str.toCharArray();
	 		for (int i=0;i<ch.length;i++ ) 
	 		{
	 			if(ch[i]!=' ')
	 			out=out+ch[i];
	 		}
	 		return out;
	 	}
	 	
	 	public static String convertUpper(String s1)
	 	{
	 		String str="";
	 		char[] ch=s1.toCharArray();
	 		for (int i=0;i<ch.length ;i++ )
	 		{
	 		if(ch[i]>=97&&ch[i]<=122)
	 		{
	 				ch[i]=(char)(ch[i]-32);
	 		}	
	 				str=str+ch[i];
	 		}
	 		str=sortString(str);
	 		return str;
	 	}
	 	public static String  sortString(String s1)
	 	{
	 			char[] ch=s1.toCharArray();
	 			for (int i=0;i<ch.length ;i++ ) 
	 			{
	 					for (int j=i+1;j<ch.length ;j++ ) {
	 						if (ch[i]>ch[j]) 
	 						{
	 								char t=ch[i];
	 								ch[i]=ch[j];
	 								ch[j]=t;	
	 						}
	 					}	
	 			}
	 			return new String(ch);
	 	}
	 	public static void main(String[] args) {
	 		String s1=removeSpace("  race guram");
	 		System.out.println("s1 original     : "	+s1);
	 		String s2=removeSpace("ragecruma");
	 		System.out.println("s2 original     : "+s2);
	 		
	 		if(s1.length()==s2.length())
	 		{
	 			String upper1=convertUpper(s1);
	 			String upper2=convertUpper(s2);
	 			System.out.println(	"s1 in UpperCase : "+upper1);
				System.out.println(	"s2 in UpperCase : "+upper2);
				if(upper1.equals(upper2))
				{
					System.out.println(s1+" is anagram ");
				}
				else
				{
					System.out.println(s1+" not anagram ");
				}

	 		}
	 		else
	 		{
	 			System.out.println(	"not anagram ==> length mismatch");
	 		}

	 	}
	 

}
