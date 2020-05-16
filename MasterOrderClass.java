import java.util.Scanner;

public class MasterOrderClass {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Orders main = new Orders();
		System.out.println("Welcome to Lauren's Pizzeria!\n");
		System.out.println("MENU");
		System.out.println("Small Pizza: $13\nMedium Pizza: $15\nLarge Pizza: $17");
		System.out.println("Toppings: 2 free, additional $2 each");
		System.out.println("Specialty Pizzas: \"hawaiian\", \"veggie\", \"white\" & \"meat-lovers\"\n");
		
		String response = "yes";
		while(response.equals("yes")) {
			System.out.println("What size would you like? Small(1) Medium(2) Large(3)");
			int size = kb.nextInt();
			kb.nextLine();
			System.out.println("\"regular\" or \"specialty\"?");
			String type = kb.nextLine();
			main.addPizza(size, type);
			System.out.println("Would you like to order another pizza? yes or no");
			response = kb.nextLine();
		}
		
		System.out.println(main.receipt());
	}

}
