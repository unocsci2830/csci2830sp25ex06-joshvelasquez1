package pizza.topping;
public class Onion extends VeggieTopping {
    @Override
    public String toString() {
        return "Onion";
    }

    @Override
    public Double getPrice() {
        return 0.49;
    }
}
