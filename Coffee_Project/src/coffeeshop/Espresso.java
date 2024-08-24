package coffeeshop;

public class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
        ingredients = new String[]{"Water", "Coffee Beans"};
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}
