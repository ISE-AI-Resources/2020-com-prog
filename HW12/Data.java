import java.util.ArrayList;
import java.util.Arrays;

public class Data {
	
	private ArrayList<DataDisplay> observers = new ArrayList<DataDisplay>();
	private ArrayList<Integer> content;
	
	public Data() { 
		content = new ArrayList<Integer>();
	}
	
	public int[] getContent() {
		int[] result = new int[content.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = content.get(i);
		}
		return result;
	}
	
	public void addToContent(int x) {
		content.add(x);
		System.out.println("\nData: " + x + " is added.");
		notifyAllObservers();
	}
	
	public String toString() {
		return Arrays.toString(content.toArray());
	}
	
	public void attach(DataDisplay observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for (DataDisplay observer : observers) {
			observer.update();
		}
	}
}
