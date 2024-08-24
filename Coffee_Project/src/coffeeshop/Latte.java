package coffeeshop;


public class Latte extends Coffee {
    public Latte() {
        name = "Latte";
        ingredients = new String[]{"Water", "Coffee Beans", "Milk"};
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}