package day3;

public class Person {
	private String name;
    private int age;
    private String gender;
    private int income;
    private double tax;

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }

    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + 
               ", income=" + income + ", tax=" + tax + "]";
    }
}
