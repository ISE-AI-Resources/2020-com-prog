import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Data d = new Data();
		DataDisplay display = new DataDisplay("General Display", d);
//		DataDisplay maxDisplay = new MaxDataDisplay("MAX-Display", d);
//		DataDisplay histogram = new HistogramDataDisplay("Histogram", d);
//		DataDisplay border = new BorderDataDisplay("Display-with-border", d);
		d.attach(display);
//		d.attach(maxDisplay);
//		d.attach(histogram);
//		d.attach(border);
		
		Scanner kbd = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------");
			System.out.print("Enter an integer >= 0: ");
			int x = kbd.nextInt();
			if (x < 0) 
				break;
			d.addToContent(x);
		}
		System.out.println("--- FINISH ---");
	}
}
