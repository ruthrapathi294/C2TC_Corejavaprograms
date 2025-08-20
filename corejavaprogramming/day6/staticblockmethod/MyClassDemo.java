package staticblockmethod;
public class MyClassDemo {

	public static void main(String[] args) {

		MyClass a = new MyClass();
		System.out.println(a);
		
		// static method with class name
				MyClass.display();

				MyClass b = new MyClass();
				System.out.println(b);
				MyClass.display();
				MyClass c = new MyClass();
				System.out.println(c);
				MyClass.display();

	}

}