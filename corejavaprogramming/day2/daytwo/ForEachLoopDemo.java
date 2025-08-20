package daytwo;
public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i:a)
		{
			System.out.println(i);
			
		}
		
		char s[]= {'c','a','p','g','e','m','i','n','i'};
		for(char c:s)
		{
			System.out.print(c);
		}
		System.out.println();
		String s1[]= {"Java","programming","learning"};
		//for String array
				for(String d:s1)
				{
					System.out.print(d+" ");		
				}
	}

}