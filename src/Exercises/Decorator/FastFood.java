package Exercises.Decorator;

public abstract class FastFood {
    private float price;
    private String description;

    public FastFood(float price, String description) {
        this.price = price;
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract float cost();
}
