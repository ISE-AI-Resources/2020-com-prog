import java.util.Scanner;
public class MyMath
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter value of x.");
		int x = sc.nextInt();
		System.out.format("The result is %.1f",f(x));
	}
	public static double f(int x)
	{
		if(x <= 0)
		{
			return x + 2;
		}
		else if(x == 1)
		{
			return 13;
		}
		else if(x <= 10)
		{
			return x*x - 2*x;
		}
		else
		{
			return x*x*x - 3*x*x;
		}

	}
}