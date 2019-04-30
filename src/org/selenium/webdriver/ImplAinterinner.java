package org.selenium.webdriver;

public class ImplAinterinner {
	
	public static void main(String[] args) {
		Ainterinner a=new Ainterinner()
				{
			public void write()
			{
				System.out.println("interface");
			}
		};
		a.write();
	}

}
