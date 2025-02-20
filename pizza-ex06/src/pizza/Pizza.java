package pizza;
import java.util.ArrayList;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppingsList;
    private ArrayList<MenuItem> menuItemsList;

    public Pizza() {
        this.crust = null;
        this.sauce = null;
        this.toppingsList = new ArrayList<PizzaTopping>();
        this.menuItemsList = new ArrayList<MenuItem>();
    }

    public PizzaCrust getCrust() {
        return this.crust;
    }

    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
    }

    public void addCrust(PizzaCrust crust) {
        this.menuItemsList.add(crust);
    }

    public PizzaSauce getSauce() {
        return this.sauce;
    }

    public void setSauce(PizzaSauce sauce) {
        this.sauce = sauce;
    }

    public void addSauce(PizzaSauce sauce) {
        this.menuItemsList.add(sauce);
    }

    public ArrayList<PizzaTopping> getTopping() {
        return this.toppingsList;
    }

    public void setTopping(ArrayList<PizzaTopping> toppings) {
        this.toppingsList = toppings;
    }

    public void addTopping(PizzaTopping topping) {
        this.toppingsList.add(topping);
        this.menuItemsList.add(topping);
    }

    public void display() {
        System.out.println(this.crust.toNiceString());
        System.out.println(this.sauce.toNiceString());
        for (PizzaTopping t : this.toppingsList) {
            System.out.println(t.toNiceString());
        }
        System.out.println("Total: " + getPrice());
    }

    public Double getPrice() {
        double totalPrice = 0.0;

        for (MenuItem item : this.menuItemsList) {
            totalPrice += item.getPrice();
        }
        
        String formattedPrice = String.format("%.2f", totalPrice);
        return Double.valueOf(formattedPrice);
    }
}
