package coffeeshop.factories;

import coffeeshop.*;

public class ConcretePastryFactory implements PastryFactory {

    @Override
    public Pastry createPastry(String type) {
        switch (type.toLowerCase()) {
            case "croissant":
                return new Croissant();
            case "muffin":
                return new Muffin();
            // Add more pastry types as needed
            default:
                throw new IllegalArgumentException("Unknown pastry type " + type);
        }
    }
}
