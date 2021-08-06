
public class DataDisplay {
	String name;
	private Data dataToBeDisplayed;
	
	public DataDisplay(String name, Data subject) {
		dataToBeDisplayed = subject;
		this.name = name;
	}
	
	public int[] getContent() {
		return dataToBeDisplayed.getContent();
	}
	
	public void update() {
		System.out.println(getClass() + ": " + name);
		System.out.println("\t" + dataToBeDisplayed);
	}
}
