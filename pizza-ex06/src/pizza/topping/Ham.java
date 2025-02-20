package pizza.topping;
public class Ham extends MeatTopping {
    @Override
    public String toString() {
        return "Ham";
    }

    @Override
    public Double getPrice() {
        return 1.49;
    }
}
