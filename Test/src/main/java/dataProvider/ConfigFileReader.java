package dataProvider;

import java.util.Properties;
import java.io.*;

public class ConfigFileReader 
{
	public Properties properties;
	
	public final String filePath="src//test//resources//Configuration.properties";
	
	public ConfigFileReader()
	{
		BufferedReader reader;
		
		try 
		{
			reader = new BufferedReader(new FileReader(filePath));
			properties = new Properties();
			
			try
			{
				properties.load(reader);
				reader.close();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not fount at "+filePath);
		}
	}
}
