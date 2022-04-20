package Practice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import PojoClass.EmployeeDetails;

public class Serialization {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		//create a java object for pojo class and provide value in the arguments of object
		
		EmployeeDetails emp = new EmployeeDetails(1,"megha",1234567890,"davanagre","megs@gmail.com");
		System.out.println(emp);
		
		//create object of object class from jackson parsar
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./emp.json"), emp);
	}
}
