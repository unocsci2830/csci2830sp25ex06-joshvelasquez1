package pizza.crust;

public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;

    public ThickCrust(boolean isDeepDish) {
        this.isDeepDish = isDeepDish;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean isDeepDish) {
        this.isDeepDish = isDeepDish;
    }

    public String toString(){
        return "Thick Crust, Deep Dish: " + isDeepDish;
    }

    @Override
    public Double getPrice() {
        return 2.99;
    }
}
