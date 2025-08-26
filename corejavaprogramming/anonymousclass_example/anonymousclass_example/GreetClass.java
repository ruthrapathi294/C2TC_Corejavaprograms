package anonymousclass_example;

import com.tnsif.dayeight.interfaces.functionalinterfaces.GreetInterface;

public class GreetClass implements GreetInterface {
	@Override
	public String greet() {		
		return "Welcome to the world of Java";
	}
}