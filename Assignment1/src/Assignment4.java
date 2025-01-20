
public class Assignment4 {

	public Assignment4(int a, int b, int c)

	{
		System.out.println("Three Parameterised Constructor");
	}
	public Assignment4()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public Assignment4(int a)
	{  this();
		System.out.println("One Parameterised Constructor");
	}
	public Assignment4(int a, int b)
	{ 
		this(1);
		System.out.println("Two Parameterised Constructor");
	}
	
	public static void main(String[] args)
	{
		
		Assignment4 obj=new Assignment4(2,5);		

	}
}
