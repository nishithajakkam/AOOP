package coffeeshop.factories;

import coffeeshop.Pastry;

public interface PastryFactory {
    Pastry createPastry(String type);
}
