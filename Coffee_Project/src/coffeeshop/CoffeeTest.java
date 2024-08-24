package coffeeshop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeTest {
    private Coffee espresso;
    private Coffee latte;

    @BeforeEach
    public void setUp() {
        espresso = new Espresso();
        latte = new Latte();
    }

    @Test
    public void testEspressoName() {
        assertEquals("Espresso", espresso.getName());
    }

    @Test
    public void testLatteName() {
        assertEquals("Latte", latte.getName());
    }

    @Test
    public void testEspressoIngredients() {
        String[] expectedIngredients = {"Water", "Coffee Beans"};
        assertArrayEquals(expectedIngredients, espresso.getIngredients());
    }

    @Test
    public void testLatteIngredients() {
        String[] expectedIngredients = {"Water", "Coffee Beans", "Milk"};
        assertArrayEquals(expectedIngredients, latte.getIngredients());
    }
}
