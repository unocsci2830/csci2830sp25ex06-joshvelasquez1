package pizza.topping;
public class PepperJack extends CheeseTopping {
    @Override
    public String toString() {
        return "PepperJack";
    }

    @Override
    public Double getPrice() {
        return 2.49;
    }
}
