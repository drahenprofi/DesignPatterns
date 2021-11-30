package Solutions.Decorator;

public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(15, "fried noodles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
