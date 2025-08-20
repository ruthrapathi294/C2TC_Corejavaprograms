package association;
public class Executor {
public static void main(String[] args) {
	
		Address address = new Address("100 Bharati Enclave, Nehru Street", "T-Nagar", "Chennai", "600103");
		Person person = new Person("Ramkumar", address);
		person.displayInfo();
	}

}
