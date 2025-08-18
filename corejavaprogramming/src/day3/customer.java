package day3;
public class customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public customer() {
        this.customerName = "Unknown";
        this.customerId = 0;
        this.customerCity = "Not Provided";
    }

    // Parameterized constructor
    public customer(String customerName, int customerId, String customerCity) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Getter and Setter methods
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // toString method for printing object details
    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\n" +
               "Customer Name: " + customerName + "\n" +
               "Customer City: " + customerCity + "\n";
    }
}
