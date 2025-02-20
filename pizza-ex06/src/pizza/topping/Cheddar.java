package pizza.topping;
public class Cheddar extends CheeseTopping {
    @Override
    public String toString() {
        return "Cheddar";
    }

    @Override
    public Double getPrice() {
        return 2.49;
    }
}
