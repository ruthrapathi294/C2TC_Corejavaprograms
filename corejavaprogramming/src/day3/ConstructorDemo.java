package day3;

public class ConstructorDemo {
	public static void main(String args[]) {
 scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        // First customer
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println(" ");

        // Using default constructor + setters
        Customer c1 = new Customer(); 
        c1.setCustomerId(id);
        c1.setCustomerName(name);
        c1.setCustomerCity(city);

        System.out.println("\n--- Customer 1 Details ---");
        c1.displayDetails();

        // Second customer
        System.out.print("\nEnter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        // Using parameterized constructor
        Customer c2 = new Customer(id, name, city); 

        System.out.println("\n--- Customer 2 Details ---");
        c2.displayDetails();

        sc.close();
    }
}

// Customer class
class Customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public Customer() {}

    // Parameterized constructor
    public Customer(int customerId, String customerName, String customerCity) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerCity = customerCity;
    }

    // Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer City : " + customerCity);
    }
}
