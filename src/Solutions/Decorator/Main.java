package Solutions.Decorator;

public class Main {
    public static void main(String[] args) {
        FastFood rice = new FriedRice();
        // Expected output: fried rice costs 10.0
        System.out.println(rice.getDescription() + " costs " + rice.cost());

        FastFood eggRice = new Egg(new FriedRice());
        // Expected output: fried rice with egg costs 11.0
        System.out.println(eggRice.getDescription() + " costs " + eggRice.cost());

        FastFood baconNoodles = new Bacon(new FriedNoodles());
        // Expected output: fried noodles with bacon costs 17.0
        System.out.println(baconNoodles.getDescription() + " costs " + baconNoodles.cost());

        FastFood eggBaconNoodles = new Egg(new Bacon(new FriedNoodles()));
        // Expected output: fried noodles with bacon with egg costs 18.0
        System.out.println(eggBaconNoodles.getDescription() + " costs " + eggBaconNoodles.cost());
    }
}
