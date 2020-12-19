package operations;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import units.EnumLength;
import units.EnumWeight;
import units.Length;
import units.Weight;

class MultiplicationTest {

    private Length l1 = new Length(2, EnumLength.KM);
    private Length l2 = new Length(1000, EnumLength.M);
    private Weight w1 = new Weight(2, EnumWeight.KG);
    private Weight w2 = new Weight(1000, EnumWeight.G);
    private Multiplication m = new Multiplication();

    @Before
    public void setUp() {
        l1 = new Length(2, EnumLength.KM);
        l2 = new Length(1000, EnumLength.M);
        w1 = new Weight(2, EnumWeight.KG);
        w2 = new Weight(1000, EnumWeight.G);

        m = new Multiplication();
    }

    @After
    public void tearDown() {
        m = null;
        l1 = null;
        l2 = null;
        w1 = null;
        w2 = null;

    }

    @Test
    void multiplicationLengthTest() {

        assertEquals(2, m.multiplication(EnumLength.KM, l1, l2), "2km * 1000m = 2km");
        assertEquals(2000000, m.multiplication(EnumLength.M, l1, l2), "2km * 1000m = 2000000 m");
        assertNotNull(m.multiplication(EnumLength.M, l1, l2));

    }

    @Test
    void multiplicationWeightTest() {
        assertEquals(2, m.multiplication(EnumWeight.KG, w1, w2), "2kg * 1000g = 2kg");
        assertEquals(2000000, m.multiplication(EnumWeight.G, w1, w2), "2kg * 1000g = 2000000 g");
        assertEquals(4, m.multiplication(EnumWeight.KG, w1, w1), "2kg * 2kg = 4 kg");
        assertNotNull(m.multiplication(EnumWeight.G, w1, w2));
        assertNotSame(2000, m.multiplication(EnumWeight.G, w1, w2));

    }

    @Test
    void multiplicationWeightCheckExceptionTest() {
        Boolean check;
        try {
            m.multiplication(EnumWeight.KG);
            check = false;
        } catch (IllegalArgumentException e) {
            check = true;
        }
        assertNotEquals(false, check);
    }

    @Test
    void multiplicationLengthCheckExceptionTest() {
        Boolean check;
        try {
            m.multiplication(EnumLength.KM);
            check = false;
        } catch (IllegalArgumentException e) {
            check = true;
        }
        assertTrue(check);
    }

    @Test
    void multiplicationLengthCheckExceptionTest2() {
        assertThrows(IllegalArgumentException.class, () -> m.multiplication(EnumLength.KM), "nie uda³o siê½");

    }

}
