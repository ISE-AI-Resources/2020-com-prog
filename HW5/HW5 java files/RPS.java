import java.util.Scanner;
public class RPS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter player1's choice (r/p/s): ");
		print("Enter player1's choice (r/p/s): ");
		char c1 = sc.nextLine().toLowerCase().charAt(0);
		if(isValid(c1)) {
			//System.out.print("Enter player2's choice (r/p/s): ");
			print("Enter player2's choice (r/p/s): ");
			char c2 = sc.nextLine().toLowerCase().charAt(0);
			if(isValid(c2)) {
				System.out.print("Player one ");
				switch(checkWin(c1,c2)){
					case 0:
						//System.out.println("loses");
						println("loses");
						break;
					case 1:
						//System.out.println("wins");
						println("wins");
						break;
					default:
						//System.out.println("draw");
						println("draw");
				}
			} 
			else {
				System.out.println("Wrong input");
			}
		}
		else {
			System.out.println("Wrong input");
		}

	}
	public static boolean isValid(char c)
	{
		String move ="rps";
		return !(move.indexOf(c)==-1);
	}
	public static int checkWin(char c1, char c2)
	{
		if(c1 == c2) {
			return 2;
		}
		if(c1 == 'r' || c2 == 'r') {
			return (c2 - c1 > 0)?1:0;
		}
		return (c2 - c1 < 0)?1:0;
	}
	public static void print(Object o)
	{
		System.out.print(o);
	}
	public static void println(Object o)
	{
		System.out.println(o);
	}
}