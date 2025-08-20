package daytwo;
public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1; i<=15;i+=2) // prints odd values of the loop
		{
			System.out.println(i);
			if(i==10) // skips the 10th iteration
			{
				continue;
			}
		}

	}

}