package coffeeshop.factories;

import coffeeshop.*;

public class ConcreteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("Unknown coffee type " + type);
        }
    }
}
