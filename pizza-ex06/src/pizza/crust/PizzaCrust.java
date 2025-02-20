package pizza.crust;
import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    private String ingredient;
    private Double price;

    public PizzaCrust() {
        this.ingredient = "";
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public abstract String toString();

    public String toNiceString() {
        return "Crust is: " + this.toString() + ", Ingredient: " + ingredient + ", Price: " + getPrice();
    }

    public String checkIntegrity() {
        if ("cauliflower".equalsIgnoreCase(ingredient)) {
            return "Warning: Fragile Crust";
        }
        return "";
    }

    public Double getPrice() {
        return this.price;
    }
}
