package nl.capgemini.volleybal.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {


    private SimpleCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }


    @Test
    public void testAdd() {
        int actual = this.calculator.add(3,4);

        int expected = 7;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int actual = this.calculator.subtract(4,3);

        Assert.assertEquals(1, actual);
    }

    @After
    public void tearDown() {
        this.calculator = null;
    }

}
