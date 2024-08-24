package coffeeshop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CroissantTest {
    private Croissant croissant;

    @BeforeEach
    public void setUp() {
        croissant = new Croissant();
    }

    @Test
    public void testCroissantName() {
        assertEquals("Croissant", croissant.getName());
    }

    @Test
    public void testCroissantIngredients() {
        String[] expectedIngredients = {"Flour", "Butter", "Sugar", "Yeast"};
        assertArrayEquals(expectedIngredients, croissant.getIngredients());
    }

    @Test
    public void testCroissantPrice() {
        assertEquals(2.50, croissant.getName());
    }
}
