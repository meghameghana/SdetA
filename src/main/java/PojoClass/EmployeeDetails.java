package PojoClass;

public class EmployeeDetails {

	//globally declare
	
	int id;
	String name;
	int phno;
	String address;
	String emailid;
	
	//Create a constructor and initialize the variables---->right click, click source ,click on generte
	//using constructor from fields click on generate , constructor is generated 
	
	public EmployeeDetails(int id, String name, int phno, String address, String emailid) {
	
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.address = address;
		this.emailid = emailid;
	}
	//for desirialisation create an empty constructor
	
	public EmployeeDetails()
	{
		
	}
		
	//Create getters and setters to access the variables--->right click, click on source.click on getters
	//-ers and setters , select all click on generate

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
