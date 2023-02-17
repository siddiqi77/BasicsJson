package jsonProject;

import java.io.File;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileToJson {
	public static void main(String[] args) {
		//String fileName="C:\\Users\\Public\\Downloads\\Fis.json";
		File file=new File("C:\\Users\\Public\\Downloads\\Fis.json");
		readFile(file);
	}

	private static void readFile(File file) {
		ObjectMapper mapper=new ObjectMapper();
		
		try {
			System.out.println("JSON Example");
			  User user=mapper.readValue(file, User.class);
			  System.out.println(user);	
		} 
		catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
