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

public class NestedJson {
	
	public static void main(String args[]) throws JacksonException {
		
		getjson(new User("Sid", "md", 30, new Address("1st cross","glb","kar","103")));

	}

	private static void getjson(User user) throws JacksonException {
	
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		System.out.println(json);
		//code to convert json to object
		User user1=mapper.readValue(json, User.class);
		
		System.out.println(user1); //or
		System.out.println(user1.getFirstName());
		System.out.println(user1.getLastName());
		System.out.println(user1.getAge());
		System.out.println(user1.getAddress().getStreet());
		System.out.println(user1.getAddress().getCity());
		System.out.println(user1.getAddress().getState());
		System.out.println(user1.getAddress().getZipCode());
		
	}
	
		
	}
	
	