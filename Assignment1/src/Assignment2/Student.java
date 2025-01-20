package Assignment2;

public class Student 
{
	int rollno;
	int Age;
	public void display1()
		{
			System.out.println("Welcome to all of you");
		}
	public void display2()
		{
		System.out.println("Automation is very easy");
		}
public static void main(String[] args)
{
	Student student1=new Student();
	student1.display1();
	student1.display2();
	student1.rollno=20;
	student1.Age=30;
	System.out.println("Roll no. is "+student1.rollno);
	System.out.println("Age is "+student1.Age);
}
}

