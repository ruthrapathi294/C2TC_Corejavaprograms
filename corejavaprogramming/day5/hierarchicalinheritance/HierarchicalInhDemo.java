package hierarchicalinheritance;
public class HierarchicalInhDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Pawan", "Pune");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Mukesh", "chennai", 101, 40000, "Technical");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Kumanan", "chennai", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);
	}

}