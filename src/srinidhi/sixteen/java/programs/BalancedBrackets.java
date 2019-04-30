package srinidhi.sixteen.java.programs;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String str="}({[))}{(";
		
		Stack<Character> st=new Stack<>();
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
			{
				st.push(ch[i]);
			}
			else if(!st.empty() && (
					(ch[i])==']'&& st.peek()=='[') ||
					(ch[i]=='}' && st.peek()=='{') ||
					(ch[i]==')' && st.peek()=='('))
				{
						st.pop();
				}
			else
			{
				st.push(ch[i]);
			}
			
		}
		if(st.empty())
			System.out.println("balanced");
		else
			System.out.println("not balanced");
	}
}
