package pizza.sauce;
import pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
    private Double price;

    public abstract String toString();

    public String toNiceString() {
        return "Sauce is: " + this.toString() + ", Price: " + getPrice();
    }

    public Double getPrice() {
        return this.price;
    }
}
