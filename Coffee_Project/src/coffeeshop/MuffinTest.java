package coffeeshop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MuffinTest {
    private Muffin muffin;

    @BeforeEach
    public void setUp() {
        muffin = new Muffin();
    }

    @Test
    public void testMuffinName() {
        assertEquals("Muffin", muffin.getName());
    }

    @Test
    public void testMuffinIngredients() {
        String[] expectedIngredients = {"Flour", "Butter", "Sugar", "Eggs", "Milk"};
        assertArrayEquals(expectedIngredients, muffin.getIngredients());
    }

    @Test
    public void testMuffinPrice() {
        assertEquals(3.00, muffin.getName());
    }
}
