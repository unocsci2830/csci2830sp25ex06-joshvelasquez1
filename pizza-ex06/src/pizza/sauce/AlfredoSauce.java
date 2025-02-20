package pizza.sauce;
public class AlfredoSauce extends PizzaSauce{
    @Override
    public String toString() {
        return "Alfredo";
    }

    @Override
    public Double getPrice() {
        return 2.49;
    }
}
