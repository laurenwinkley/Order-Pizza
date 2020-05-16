
public class SpecialtyPizza extends Pizza {

	private String name;
	
	public SpecialtyPizza(String name, int size) {
		super(size);
		this.name = name;
		if(name.equals("hawaiian")) {
			String[] toppings = {"pineapple", "ham"};
			super.setToppings(toppings);
		}
		else if(name.equals("veggie")) {
			String[] toppings = {"peppers", "mushrooms", "onions", "olives"};
			super.setToppings(toppings);
			super.setCost(super.cost());
		}
		else if(name.equals("white")) {
			String[] toppings =  {"Mozzarella", "Ricotta"};
			super.setToppings(toppings);
		}
		else {
			String[] toppings =  {"sausage", "pepperoni", "ham"};
			super.setToppings(toppings);
			super.setCost(super.cost());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String result = "";
		if(getSize() == 1) {
			result+="Small ";
		}
		else if(getSize() == 2) {
			result+="Medium ";
		}
		else {
			result+="Large ";
		}
		result+= getName() + " pizza ... $" + getCost() + "0\n";
		return result;
	}
}
