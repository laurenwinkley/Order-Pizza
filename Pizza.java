
public class Pizza{

	private int size;
	// small = 1; medium = 2; large = 3
	private String[] toppings;
	// 3 free; additional $2
	private double cost;
	// small = 13; medium = 15; large = 17
	
	public Pizza() {
		size = 2;
		String[] toppings = {};
		this.toppings = toppings;
		cost = 15;
	}
	
	public double cost() {
		int cost = 0;
		if(size == 1) {
			cost+=13;
		}
		else if (size == 2){
			cost+=15;
		}
		else {
			cost+=17;
		}
		if(toppings.length > 2) {
			int temp = toppings.length - 2;
			cost+= (temp * 2);
		}
		return cost;
	}
	
	public Pizza(int size) {
		this.size = size;
		String[] toppings = {};
		this.toppings = toppings;
		cost = cost();
	}
	
	public Pizza(int size, String[] toppings) {
		this.size = size;
		this.toppings = toppings;
		cost = cost();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		String result = "";
		if(getSize() == 1) {
			result+="Small pizza with ";
		}
		else if(getSize() == 2) {
			result+="Medium pizza with ";
		}
		else {
			result+="Large pizza with ";
		}
		if(toppings.length == 0) {
			result+="no toppings ... ";
		}
		else {
			for(int i = 0; i < toppings.length-1; i++) {
				result+=toppings[i] + ", ";
			}
			result+="and " + toppings[toppings.length-1] + " ... ";
		}
		result += "$" + getCost() + "0\n";
		return result;
	}
	
}
