package pizza.topping;
public class GreenPepper extends VeggieTopping {
    @Override
    public String toString() {
        return "Green Pepper";
    }

    @Override
    public Double getPrice() {
        return 0.49;
    }
}