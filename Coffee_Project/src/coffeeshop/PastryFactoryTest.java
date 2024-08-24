package coffeeshop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeeshop.factories.PastryFactory;

public class PastryFactoryTest {
    private PastryFactory pastryFactory;

    @BeforeEach
    public void setUp() {
        PastryFactory PastryFactoryTest = new PastryFactory();
    }

    @Test
    public void testCreateCroissant() {
        Pastry croissant = pastryFactory.createPastry("Croissant");
        assertNotNull(croissant);
        assertEquals("Croissant", croissant.getName());
    }

    @Test
    public void testCreateMuffin() {
        Pastry muffin = pastryFactory.createPastry("Muffin");
        assertNotNull(muffin);
        assertEquals("Muffin", muffin.getName());
    }
}
