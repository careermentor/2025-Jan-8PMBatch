package firstjavaPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class FileHandling 
{

	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./DataFolder/xyz.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("lang"));
		System.out.println(prop.get("automation"));
	}
	
	
	public static void writedata() throws Exception
	{
		File f = new File("./DataFolder/abc.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
		
		System.out.println("this program run successfully");
		
	}
	
	
	public static void readtextfile() throws Exception
	{
		//aproach one
		//File f = new File("C:\\TestData\\data.txt");  //file connection
		//FileReader fr = new FileReader(f);
		
		//aproach two
		
		//FileReader fr = new FileReader("C:\\TestData\\data.txt");
		
		FileReader fr = new FileReader("./DataFolder/data.txt");
		
		int r = fr.read();  //116
		
		while(r!=-1)
		{
			System.out.print((char)r);
			 r = fr.read();
		}
		
		}
	
	
	public static void main(String[] args) throws Exception
	{
	
		readprop();
		
	}
	
}
