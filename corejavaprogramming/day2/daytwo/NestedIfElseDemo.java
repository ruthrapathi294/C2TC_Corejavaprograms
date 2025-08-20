package daytwo;
public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=45, b=12, c=2;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}
	}

}