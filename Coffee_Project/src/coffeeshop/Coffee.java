package coffeeshop;

public abstract class Coffee {
	 String name;
	    String[] ingredients;
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String[] getIngredients() {
	        return ingredients;
	    }

	    public abstract void prepare();
}
