package jsonProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	
	public static void main(String args[]) throws JacksonException {
		
		getjson(new User("Sid", "md", 30));
	}

	private static void getjson(User user) throws JacksonException {
		ObjectMapper mapper=new ObjectMapper();
		//writerWithDefaultPrettyPrinter() prints in json format
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		System.out.println(json);
		
		
	}
	
		
	}
	
	