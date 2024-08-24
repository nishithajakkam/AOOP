package coffeeshop;

import coffeeshop.factories.*;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new ConcreteCoffeeFactory();
        PastryFactory pastryFactory = new ConcretePastryFactory();

        // Testing Coffee
        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        espresso.prepare();

        Coffee latte = coffeeFactory.createCoffee("Latte");
        latte.prepare();

        // Testing Pastry
        Pastry croissant = pastryFactory.createPastry("Croissant");
        croissant.prepare();

        Pastry muffin = pastryFactory.createPastry("Muffin");
        muffin.prepare();
    }
}
