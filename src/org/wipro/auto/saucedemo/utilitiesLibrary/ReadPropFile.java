package org.wipro.auto.saucedemo.utilitiesLibrary;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile
{

	public static String readconfig(String key) throws Exception
	{
		File f = new File("./TestData/config.properties");
		
		FileReader fr = new FileReader(f);		
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}

	
	public static String readelement(String key) throws Exception
	{
		File f = new File("./TestData/element.properties");
		
		FileReader fr = new FileReader(f);		
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}


}
