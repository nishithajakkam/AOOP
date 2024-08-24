package mathutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testPositiveExponent() {
        assertEquals(8.0, MathUtils.power(2, 3), 0.0001); // 2^3 = 8
    }

    @Test
    public void testZeroExponent() {
        assertEquals(1.0, MathUtils.power(2, 0), 0.0001); // 2^0 = 1
    }

    @Test
    public void testNegativeExponent() {
        assertEquals(0.125, MathUtils.power(2, -3), 0.0001); // 2^-3 = 1/8 = 0.125
    }

    @Test
    public void testPositiveBaseNegativeExponent() {
        assertEquals(0.04, MathUtils.power(5, -2), 0.0001); // 5^-2 = 1/25 = 0.04
    }

    @Test
    public void testNegativeBasePositiveExponent() {
        assertEquals(-8.0, MathUtils.power(-2, 3), 0.0001); // (-2)^3 = -8
    }

    @Test
    public void testNegativeBaseEvenExponent() {
        assertEquals(4.0, MathUtils.power(-2, 2), 0.0001); // (-2)^2 = 4
    }

    @Test
    public void testNegativeBaseNegativeExponent() {
        assertEquals(-0.125, MathUtils.power(-2, -3), 0.0001); // (-2)^-3 = -1/8 = -0.125
    }

    @Test
    public void testFractionalBasePositiveExponent() {
        assertEquals(0.25, MathUtils.power(0.5, 2), 0.0001); // (0.5)^2 = 0.25
    }

    @Test
    public void testFractionalBaseNegativeExponent() {
        assertEquals(4.0, MathUtils.power(0.5, -2), 0.0001); // (0.5)^-2 = 4
    }
}
