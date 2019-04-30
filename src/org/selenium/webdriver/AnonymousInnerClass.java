package org.selenium.webdriver;

public class AnonymousInnerClass {
	 static A a=null;
	public static void main(String[] args)
	{
		
		
		a=new A() {
			public void write() 
			{
				System.out.println("wait method");
			}
		};
		a.write();
		System.out.println("main method");
		read();
	}
	public static void read()
	{
		a.write();
	}

}
