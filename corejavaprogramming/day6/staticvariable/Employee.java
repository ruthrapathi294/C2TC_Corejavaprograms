package staticvariable;
public class Employee {
	
	//Decalaring instance variables
	
	private String Name;
	private int empid;
	
	static String compName = "Capgemini";
	
	Employee(String Name , int empid)
	{
		this.Name = Name;
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", empid=" + empid + "]";
	}
	
	
	
}