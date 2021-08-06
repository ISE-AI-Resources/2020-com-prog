
public class MTGCard {
	String name;
	String cost;
	String text;

	public MTGCard(String name, String cost, String text) {
		super();
		this.name = name;
		this.cost = cost;
		this.text = text;
	}

	public boolean equals(Object o) {
		MTGCard o2 = (MTGCard) o;
		return (this.name.equals(o2.name) && this.cost.equals(o2.cost) && this.text.equals(o2.text));


	}

}
