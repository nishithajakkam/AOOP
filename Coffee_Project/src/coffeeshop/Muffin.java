package coffeeshop;

public class Muffin extends Pastry {
    public Muffin() {
        name = "Muffin";
        ingredients = new String[]{"Flour", "Butter", "Sugar", "Eggs", "Milk"};
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}