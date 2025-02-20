package pizza.topping;
public class Mozzarella extends CheeseTopping {
    @Override
    public String toString() {
        return "Mozzarella";
    }

    @Override
    public Double getPrice() {
        return 2.49;
    }
}
