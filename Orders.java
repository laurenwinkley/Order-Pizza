import java.util.ArrayList;
import java.util.Scanner;

public class Orders {
	Scanner kb = new Scanner(System.in);
	
	private ArrayList<Pizza> pizzas;
	
	public Orders() {
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		this.pizzas = pizzas;
	}
	
	public void addPizza(int size, String type) {
		if (type.equals("specialty")) {
			pizzas.add(orderSpecialtyPizza(size));
		}
		else {
			pizzas.add(orderRegularPizza(size));
		}
	}
	
	public String printOrder() {
		return pizzas.toString();
	}
	
	private Pizza orderRegularPizza(int size) {
		System.out.println("How many toppings would you like? ");
		String[] toppings = new String[kb.nextInt()];
		kb.nextLine();
		for(int i = 0; i < toppings.length; i++) {
			System.out.println("What topping would you like?: ");
			toppings[i] = kb.nextLine();
		}
		Pizza temp = new Pizza(size, toppings);
		return temp;
	}
	
	private Pizza orderSpecialtyPizza(int size) {
		System.out.println("Which type of specialty pizza would you like? ");
		String name = kb.nextLine();
		SpecialtyPizza temp = new SpecialtyPizza(name, size);
		return temp;
	}
	
	public double cost() {
		double total = 0.0;
		for(int i = 0; i < pizzas.size(); i++) {
			total+=pizzas.get(i).getCost();
		}
		return total;
	}
	
	public String receipt() {
		String response = "\nReceipt:\nThank you for ordering from Lauren's Pizzeria!\n";
		response+= "\n";
		for(int i = 0; i < pizzas.size(); i++) {
			response += pizzas.get(i).toString();
		}
		response += "\nYour total ... $" + cost() + "0";
		response += "\nThank you for coming!";
		return response;
	}
}
