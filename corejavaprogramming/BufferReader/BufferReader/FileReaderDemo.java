package BufferReader;
import java.io.*;
import java.net.URL;

public class FileReaderDemo {

	public static void main(String[] args)throws IOException {
		URL resource = FileReaderDemo.class.getResource("Adithiyaac70.txt");
		
		if(resource == null)
		{
			System.err.println("File not found");
			return;
		}
		
		File file = new File(resource.getFile());
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		String Line;
		
		while((Line = reader.readLine()) != null)
		{
			System.out.println(Line);
		}
		reader.close();
	}

}