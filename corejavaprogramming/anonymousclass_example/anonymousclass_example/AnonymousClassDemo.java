package anonymousclass_example;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		GreetClass g1=new GreetClass();
		g1.greet();
		
		//Anonymous Class
		GreetInterface g=new GreetInterface() {
			@Override
			public String greet() {		
				return "Welcome to the world of Java";
			}
		};
		g.greet();
		
		//Lambda Expression---Anonymous method--used only in functional Interface
		GreetInterface g3=() -> {
			return "Welcome to the world of Java";
		};
	}
}