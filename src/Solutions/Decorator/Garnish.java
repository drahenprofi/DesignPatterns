package Solutions.Decorator;

public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String description) {
        super(price, description);
        this.fastFood = fastFood;
    }

    @Override
    public float cost() {
        return super.getPrice() + fastFood.cost();
    }

    @Override
    public String getDescription() {
        return fastFood.getDescription() + " with " + super.getDescription();
    }
}
