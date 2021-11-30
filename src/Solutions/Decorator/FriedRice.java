package Solutions.Decorator;

public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "fried rice");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
