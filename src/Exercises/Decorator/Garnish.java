package Exercises.Decorator;

public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String description) {
        super(price, description);
        this.fastFood = fastFood;
    }

    @Override
    public float cost() {
        // TODO: Calculate the total cost of fast food and garnish and return it
        return 0;
    }

    @Override
    public String getDescription() {
        // TODO: Return the description of the fast food with garnish
        // e.g. fried rice with egg
        return "";
    }
}
