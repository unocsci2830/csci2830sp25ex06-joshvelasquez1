package pizza;
import java.util.Scanner;
import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.AlfredoSauce;
import pizza.sauce.TomatoSauce;
import pizza.topping.Bacon;
import pizza.topping.Cheddar;
import pizza.topping.ColbyJack;
import pizza.topping.GreenPepper;
import pizza.topping.Ham;
import pizza.topping.Mozzarella;
import pizza.topping.Mushroom;
import pizza.topping.Olive;
import pizza.topping.Onion;
import pizza.topping.PepperJack;
import pizza.topping.Pepperoni;
import pizza.topping.Sausage;

public class PizzaMain {
    private Pizza pizza;
    private Scanner input;

    public PizzaMain(){
        pizza = new Pizza();
        input = new Scanner(System.in);
    }

    private void inputCrustChoice() {
        System.out.println("Select a pizza crust:");
        System.out.println("1 - Thick Crust");
        System.out.println("2 - Thin Crust");
        System.out.print("Enter choice: ");

        while (true){
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1){
                System.out.print("Deep dish? (Y/N): ");
                Boolean validChoice = false;
                while (!validChoice){
                    String deepDish = input.nextLine();
                    switch (deepDish) {
                        case "Y":
                        case "y":
                            pizza.setCrust(new ThickCrust(true));
                            pizza.addCrust(new ThickCrust(true));
                            validChoice = true;
                            break;
                        case "N":
                        case "n":
                            pizza.setCrust(new ThickCrust(false));
                            pizza.addCrust(new ThickCrust(false));
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Pick Y or N");
                    }
                }
                break;
            } else if (choice == 2) {
                pizza.setCrust(new ThinCrust());
                pizza.addCrust(new ThinCrust());
                break;
            } else {
                System.out.print("Invalid choice. Enter choice(1 or 2): ");
            }
        } 

        Boolean validChoice = false;
        System.out.println("Flour");
        System.out.println("Cauliflower");
        System.out.print("Enter crust ingredient: ");
        while (!validChoice){
            String choice = input.nextLine();
            switch (choice) {
                case "Flour":
                case "flour":
                    pizza.getCrust().setIngredient("Flour");
                    validChoice = true;
                    break;
                case "Cauliflower":
                case "cauliflower":
                    pizza.getCrust().setIngredient("Cauliflower");
                    validChoice = true;
                    break;
                default:
                    System.out.println("Pick between Flour and Cauliflower");
            }
        }
    }

    private void inputSauceChoice() {
        System.out.println("Select a pizza sauce:");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");
        System.out.print("Enter choice: "); 

        while (true){
            int choice = input.nextInt();

            if (choice == 1){
                pizza.setSauce(new TomatoSauce());
                pizza.addSauce(new TomatoSauce());
                break;
            } else if (choice == 2) {
                pizza.setSauce(new AlfredoSauce());
                pizza.addSauce(new AlfredoSauce());
                break;
            } else {
                System.out.print("Invalid choice. Enter choice(1 or 2): ");
            }
        }
    }

    private void inputToppingChoices() {
        System.out.print("How many toppings? ");
        Integer numToppings = input.nextInt();
        for (Integer i = 0; i < numToppings; i++) {
            System.out.println("1 - Pepperoni");
            System.out.println("2 - Sausage");
            System.out.println("3 - Ham");
            System.out.println("4 - Bacon");
            System.out.println("5 - Green Pepper");
            System.out.println("6 - Mushroom");
            System.out.println("7 - Olive");
            System.out.println("8 - Onion");
            System.out.println("9 - Cheddar");
            System.out.println("10 - Colby Jack");
            System.out.println("11 - Mozzarella");
            System.out.println("12 - Pepperjack");

            while (true){
                int choice = input.nextInt();

                if (choice == 1) {
                    pizza.addTopping(new Pepperoni());
                    break;
                } else if (choice == 2) {
                    pizza.addTopping(new Sausage());
                    break;
                } else if (choice == 3) {
                    pizza.addTopping(new Ham());
                    break;
                } else if (choice == 4) {
                    pizza.addTopping(new Bacon());
                    break;
                } else if (choice == 5) {
                    pizza.addTopping(new GreenPepper());
                    break;
                } else if (choice == 6) {
                    pizza.addTopping(new Mushroom());
                    break;
                } else if (choice == 7) {
                    pizza.addTopping(new Olive());
                    break;
                } else if (choice == 8) {
                    pizza.addTopping(new Onion());
                    break;
                } else if (choice == 9) {
                    pizza.addTopping(new Cheddar());
                    break;
                } else if (choice == 10) {
                    pizza.addTopping(new ColbyJack());
                    break;
                } else if (choice == 11) {
                    pizza.addTopping(new Mozzarella());
                    break;
                } else if (choice == 12) {
                    pizza.addTopping(new PepperJack());
                    break;
                }
            }
        }
    }
    private void showPizza() {
		pizza.display();
	}
	
	public void runMenu() {
		inputCrustChoice();
		inputSauceChoice();
		inputToppingChoices();
		showPizza();
        String integrityMessage = pizza.getCrust().checkIntegrity();
        if (!integrityMessage.isEmpty()) {
            System.out.println(integrityMessage);
        }
	}
	
	public static void main(String[] args) {
		PizzaMain pm = new PizzaMain();
		pm.runMenu();
    }
}

