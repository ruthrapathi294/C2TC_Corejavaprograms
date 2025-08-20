package staticblockmethod;
public class MyClass {
	private int section; // non-static var
	private static int srNO; // static var
	
	//static block
	
	static {
		System.out.println("------------Within Static Block--------------------");
		srNO=100;
	}
	
	//default constructor
	
	MyClass(){
		System.out.println("------------Within Default Constructor--------------------");
		srNO++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [Serial NO"+srNO+",section=" + section + "]";
	}	
		static void display() {
			System.out.println("Serial NO."+srNO);
		}
	
	
	
	
}
