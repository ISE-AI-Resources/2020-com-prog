public class example
{
	public static void main(String[] args)
	{
		Student t = new Student("toffy",19,"6338xxxxx21");

	}
	public static int add(int x,int y)
	{
		return x + y;
	}
}
public class Student
{
	//object data
	public String name;
	public int age;
	public String id;

	//class data
	public static String major = "Ai";
	public Student(String name, int age, String id)
	{
		this.name = name;
		this.age = age;
		this.id = id;
	}

	//object method
	public void getName()
	{
		System.out.println(this.name);
	}

	//
	public static void walk()
	{

	}
}