public class Item {
	
	private String name;
	private int qty;
	private double price;
	
	public Item() {
		
	}
	
	public Item(String n, int q, double p) {
		name = n;
		qty = q;
		price = p;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setQty(int q) {
		qty = q;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		String s = "" + getName() + "\t" + getQty() + "\t\t" + getPrice();
		return s;
	}
}
