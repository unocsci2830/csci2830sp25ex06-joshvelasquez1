package pizza.sauce;
public class TomatoSauce extends PizzaSauce{
    @Override
    public String toString(){
        return "Tomato";
    }

    @Override
    public Double getPrice() {
        return 1.99;
    }
}
