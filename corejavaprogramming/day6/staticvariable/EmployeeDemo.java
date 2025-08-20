package staticvariable;
public class EmployeeDemo {

	public static void main(String[] args) {
		
		// creating the first object of the class and paasing the two arg with type
		
		System.out.println(Employee.compName);
		Employee e = new Employee("Adithiyaa",101);
		System.out.println(e);
		
		e = new Employee("Yaswanth",102);
		System.out.println(e);
	}

}