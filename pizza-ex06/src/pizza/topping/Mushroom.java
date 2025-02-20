package pizza.topping;
public class Mushroom extends VeggieTopping {
    @Override
    public String toString() {
        return "Mushroom";
    }

    @Override
    public Double getPrice() {
        return 0.49;
    }
}
