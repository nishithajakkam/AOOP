package coffeeshop;

public class Croissant extends Pastry {
    public Croissant() {
        name = "Croissant";
        ingredients = new String[]{"Flour", "Butter", "Sugar", "Yeast"};
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}
