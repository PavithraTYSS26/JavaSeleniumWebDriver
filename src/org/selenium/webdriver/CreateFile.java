package org.selenium.webdriver;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	File file=null;
	public CreateFile(String path)
	{
		 file=new File(path);

	}
public void cf(){
	
		 try {
		System.out.println(file.createNewFile());
		} catch (IOException e) {
		
			e.printStackTrace();
		}

}

}
