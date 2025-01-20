package Assignment2;

public class Assignment2 
{
	public int sum(int k, int b)
	{
		int c=k+b;
		return c;
	}
	public int sub(int x, int y)
	{
		int z=x-y;
		return z;
	}
	public int multi(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public void div(int x, int y)
	{
		int z=x/y;
		System.out.println("Div result= "+z);
	}
	public static void main(String[] args) {
		Assignment2 result=new Assignment2();
		int result1;
		result1=result.sum(10,2);
		System.out.println("Sum result = "+result1);
		result1=result.sum(result1,2);
		System.out.println("Sum result = "+result1);
		result1=result.sub(result1,2);
		System.out.println("Sub result = "+result1);
		result1=result.multi(result1,2);
		System.out.println("Mul result= "+result1);
		result.div(result1,2);
	}

}
