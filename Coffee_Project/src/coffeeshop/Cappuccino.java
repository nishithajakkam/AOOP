package coffeeshop;

public class Cappuccino extends Coffee {
    public Cappuccino() {
        name = "Cappuccino";
        ingredients = new String[]{"Water", "Coffee Beans", "Milk", "Foam"};
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}