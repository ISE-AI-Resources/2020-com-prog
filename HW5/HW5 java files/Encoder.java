import java.util.Scanner;

public class Encoder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character ");
		char c = sc.next().toLowerCase().charAt(0);
		switch(c)
		{

			case('a'):
				System.out.println("B");
				break;
			case('b'):
				System.out.println("C");
				break;
			case('c'):
				System.out.println("D");
				break;
			default:
				System.out.println("Z");

		}
	}
}