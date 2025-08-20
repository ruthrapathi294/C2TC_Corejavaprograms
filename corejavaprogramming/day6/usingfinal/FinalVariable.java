package usingfinal;
public class FinalVariable {
	
	// final int x; // final instance variable must be initialized
	final int a = 10;
	
	// Declare a static blank final variable.
	final static int y;
	
	final static int z = 20;
	
	void change() {
		a = 30;
		b = 200;
	}

	@Override
	public String toString() {
		return "FinalVariable [a=" + a + "]";
	}
	
	
	static {
		b = 20;
		z=100;
		System.out.println("value of Y:"+y);
	}
}