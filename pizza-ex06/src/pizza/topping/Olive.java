package pizza.topping;
public class Olive extends VeggieTopping {
    @Override
    public String toString() {
        return "Olive";
    }

    @Override
    public Double getPrice() {
        return 0.49;
    }
}
