package lab02;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExampleTest {
    private Example example;

    @Before
    public void setUp() {
        example = new Example(3, 2);
    }

    @Test
    public void testIfFunctionA() {
        assertEquals(4, example.Function_A(1));
    }

    @Test
    public void testElseFunctionA() {
        assertEquals(-4, example.Function_A(-1));
    }

    @Test
    public void testIfFunctionB() {
        assertEquals(3, example.Function_B(1));
    }

    @Test
    public void testElseFunctionB() {
        assertEquals(5, example.Function_B(7));
    }
}
