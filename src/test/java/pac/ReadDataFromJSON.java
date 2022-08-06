package pac;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSON {

	public static void main(String[] args) throws IOException, ParseException {
		 //file path 
		
		FileReader inputfile = new FileReader("../SDET_ME/CommanData.json");
		
		// pass the json objet into java data stream 
		
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(inputfile);
		
		// type cast the object into hashmap and read the data into key and value format
		HashMap jobj = (HashMap)obj;
		
		String value = jobj.get("Name").toString();
		
		System.out.println(value);
	}

}
