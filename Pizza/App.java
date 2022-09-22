// import the Scanner class
import java.util.Scanner;

public class App {

	// Scanner Object
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		orderPizza();
	}

	static void orderPizza() {

		System.out.println("Welcome to Jisoo's Pizza!");

		System.out.println("Enter letter A if you want a Ham and Chees pizza!");
		System.out.println("Enter letter B if you want a Vegetarian pizza!");

		System.out.print("Enter your choice: ");
		char choice = scan.next().charAt(0);

		// Initial value
		String pizza = "";
		double price = 0;

		switch (choice) {
			case 'A':
				pizza = "Ham and Cheese Pizza";
				price = 450;
				break;
			case 'B':
				pizza = "Vegetarian Pizza";
				price = 505;
				break;
			default:
				System.out.println("Please enter A or B!");
				return; // EXIT PROGRAM
		}

		System.out.println("Your order is: " + pizza);
		System.out.println("Your total order amount is: " + price);

		System.out.println("\n" + "YOUR TYPE OF CRUST");
		System.out.println("Enter A if you want your crust to be THIN!");
        System.out.println("Enter B if you want your crust to be Hand Tossed!");

		System.out.print("Enter your choice: ");
		char crust = scan.next().charAt(0);

        String av = "";
		switch (crust) {
			case 'A':
				av = "Thin";
				break;
			case 'B':
				av = "Thin";
				break;
			default:
				System.out.println("You wanna have No Crust on your pizza ba?");
				return;
		}

        System.out.println("Your Crust will be " + av);

		System.out.println("Choose your Size for your pizza!!!");
		System.out.println("Enter S for Small ");
        System.out.println("Enter M for Medium ");
        System.out.println("Enter L for Large ");
        System.out.println("Enter U for Extra Large ");
        System.out.println("ENTER HERE: ");
		char size = scan.next().charAt(0);

		String sz = "";
        switch (size) {
			case 'S':
                sz = "Small";
                break;
			case 'M':
                sz = "Medium";
                break;
            case 'L':
                 sz = "Large";
				break;
			case 'U':
                sz = "Extra Large";
				break;
			default:
				System.out.println("A big no for that");
				return;
		}
        System.out.println("Your Pizza Size is " + sz);

		System.out.print("\n" + "Quantity of your order: ");
		int quantity = scan.nextInt();

        double total;
        total = quantity * price;
        
     System.out.println("\n" + "\n" + "----- Summary -----" + "\n" + "\n" + "Pizza Meal: " + choice + "\n" + "  - " + pizza + "\n" + "         Crust: " + av + "\n" + "           Size: " + sz  + "\n" + "              Quantity: " + quantity + "\n" + "\n" + " Subtotal: Php " + total + "\n" + "\n" + "\n" + "THANK YOU FOR ORDERING! and COME AGAIN");
     


        
        scan.close();

			
    }     

}
        

