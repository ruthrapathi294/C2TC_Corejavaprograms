package day3;
	import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter Person Name : ");
        String name = ob.next();

        System.out.println("Enter age: ");
        int age = ob.nextInt();

        System.out.println("Enter gender: ");
        String gender = ob.next();

        System.out.println("Enter taxable income: ");
        int income = ob.nextInt();

        // Person object and initialize values
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // Display person details
        System.out.println(person);

        // Tax calculation
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        System.out.println("After calculating tax : ");
        System.out.println(person);

        ob.close();
    }
}

