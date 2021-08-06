import java.util.Scanner;

public class KeyboardInput {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.print("What is your name? ");
		String a = kbd.nextLine();

		System.out.print("How old are you? ");
		int b = kbd.nextInt();

		System.out.print("What is your high school's GPA? ");
		double c = kbd.nextDouble();

		System.out.print("What is your major in ISE? ");
		String d = "N/A";
		d = kbd.nextLine();

		System.out.format("My name is [%s].%n", a);
		System.out.format("I am [%d] years old.%n", b);
		System.out.format("I graduated with [%f] GPA.%n", c);
		System.out.format("Currently, I study [%s] in ISE.%n", d);

	}
}