package multilevelinheritance;
import java.util.Date;
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

		Person p1 = new Person("ruthra", 720060452, new Date(2005, 22, 03));
		System.out.println(p1);

		p1 = new Employee("Mukesh Kumar", 87878797, new Date(2005, 02, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Kumanan", 988027l, new Date(2005, 12, 05), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);

	}

}