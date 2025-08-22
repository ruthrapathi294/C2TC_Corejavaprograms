package BufferReader;
import java.io.*;

public class BufferReaderDemo {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		String name = br.readLine();
		System.out.println("Enter the age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter the Salary");
		double salary = Double.parseDouble(br.readLine());
		
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
	}

}