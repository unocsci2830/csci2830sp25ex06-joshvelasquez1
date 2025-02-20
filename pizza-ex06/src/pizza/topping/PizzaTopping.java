package pizza.topping;
import pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem {
    private Double price;

    public abstract String toString();

    public String toNiceString() {
        return "Topping is: " + this.toString() + ", Price: " + getPrice();
    }

    public Double getPrice() {
        return this.price;
    }

}