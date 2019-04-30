package srinidhi.sixteen.java.programs;

public class RotationOfString {
	public static boolean length(String in,String rot)
	{
		return in.length()==rot.length()? true:false;
	}
	public static boolean equals(String in,String rot)
	{
		return in.equals(rot)?true:false;
	}
	public static boolean index(String in,String rot)
	{
		char c1=in.charAt(0);
		boolean b=false;
		int i;
		for ( i = 0; i < rot.length(); i++) {
				if(rot.charAt(i)==c1)
				{
				in=in.substring(in.length()-1);
				rot=rot.substring(0,i);
				b= in.equals(rot);
				}
			
				else
				{
				b=false;
				}
		}
		return b;
		
	}
	public static void main(String[] args) {
		String in="abcd";
		String rot="dabc";
		System.out.println("Main method starts.......");
		boolean len=length(in,rot);
		if(len)
		{
			boolean eq=equals(in,rot);
			if(eq==false)
			{
				boolean ind=index(in,rot);
				if(ind)
					System.out.println(" The String "+rot+" is rotation of Input string "+in);
				else
					System.out.println(" Different in index ");
				
			}
			else
			{
				System.out.println(" Both are equal ROTATION ");
			}
		}
		else
		{
			System.out.println("Length mismatch NO ROTATION ");
		}
			
	}

}
