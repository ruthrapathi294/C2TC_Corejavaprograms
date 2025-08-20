package firstpackage;
public class Base {
	
	/*
	 * Declaring default, public, private and protected variables 
	 */
	int varDefault=100;
	public int varPublic=200;
	private int varPrivate=300;
	protected int varProtected=400;
	
	/*
	 * Declaring methods with default, public, private, protected types
	 */

	void methodDefault()
	{
		System.out.println("--------Default access Base class----------");
		System.out.println("Default Variable : "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("----------Public access Base class---------");
		System.out.println("Public Variable : "+varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("-----------Private access Base class--------");
		System.out.println("Private Variable : "+varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("-------------Protected access Base class-------");
		System.out.println("Protected Variable : "+varProtected);
	}
}