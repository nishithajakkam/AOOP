package coffeeshop.factories;

import coffeeshop.Coffee;

public interface CoffeeFactory {
	 Coffee createCoffee(String type);
}
