package pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData_PropFile {

	public static void main(String[] args) throws Throwable   {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./CommonData.properties");
		prop.load(fis);
		String value = prop.getProperty("Name");
		String value2 = prop.getProperty("Address");
		String value3 = prop.getProperty("Roll");
		 System.out.println(value);
		 System.out.println(value2);
		 System.out.println(value3);

	}

}
