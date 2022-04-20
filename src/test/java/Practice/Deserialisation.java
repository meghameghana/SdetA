package Practice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import PojoClass.EmployeeDetails;

public class Deserialisation {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj = new ObjectMapper();
		EmployeeDetails ele = obj.readValue(new File("./emp.json"),EmployeeDetails.class);
		
		System.out.println(ele.getAddress());
		System.out.println(ele.getEmailid());
		System.out.println(ele.getName());
		System.out.println(ele.getPhno());
		System.out.println(ele.getId());
		
	}

}
